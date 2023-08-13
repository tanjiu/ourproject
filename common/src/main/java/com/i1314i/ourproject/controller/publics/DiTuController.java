package com.i1314i.ourproject.controller.publics;

import com.i1314i.ourproject.controller.BaseController;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.ditu.*;
import com.i1314i.ourproject.utils.httpclient.WxHttpClientUtils;
import org.apache.http.HttpException;

import com.i1314i.ourproject.po.ditu.Mapinfo;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.*;

/**
 * @author 平行时空
 * @created 2018-11-28 12:16
 **/

@RestController
@RequestMapping(value = "/public")
public class DiTuController extends BaseController{
    private Logger logger= LoggerFactory.getLogger(DiTuController.class);
    @Autowired
    private ResultMap resultMap;

    @RequestMapping(value = "/mapdata")
    public ResultMap getResult(String type,String orig,String dest,String style,String mid) throws HttpException, URISyntaxException, DocumentException, IOException {

        String postStr="{\"orig\":\""+orig+"\",\"dest\":\""+dest+"\",\"style\":"+style+",\"mid\":\""+mid+";\"}";
        logger.info(postStr);

        DiTuResponse diTuResponse=getdata(type,postStr);

        return resultMap.start().code("200").msg("success").data(diTuResponse);
    }

    public  DiTuResponse getdata(String type,String postStr) throws IOException, HttpException, URISyntaxException, DocumentException {

        String xml=  WxHttpClientUtils.doGetBase("http://www.sdmap.gov.cn/PathService.ashx?type="+type+"&postStr="+postStr);

        SAXReader reader = new SAXReader();
        reader.setEncoding("GB2312");//这里设置文件编码
        /** 1.创建一个读取XML文件的对象 用来指向XML文件的输入流
         *  这个XML文件其实就是磁盘上的一个物理文件,我需要将它变成JAVA的对象
         *  我们知道JAVA的对象是存在内存中的,所以我们就是要将物理的磁盘上的数据拿到内存中
         *  那么首先我们是要将文件的内容拿到内存中,然后再内存中进行处理
         */


        /**
         * 2.创建一个(当前项目类路径下的)输入流 指向这个XML文件
         * 因为它不是直接将文件内容拿到内存里,而是通过读取流,所以要先创建一个输入流
         * 语法:
         * InputStream 引用名 = 类名.class.getClassLoader().getResourceAsStream("文件名");
         */
        InputStream is =new ByteArrayInputStream(xml.getBytes());
        /**
         *3.我们通过SAXReader这个对象利用流来读取这个对象 通过这个方法我们就把所有的XML数据拿到内存里了 返回了一个文档类型的对象
         * 通过reader下的对象调用read()方法,并且将InputStream对象传进去
         * 注意：导包的时候导入import org.dom4j.Document;包
         */
        Document doc = reader.read(is);

        /**
         * 拿到XML的内容之后，首先我们要读取xml的根元素,再通过根元素读取子元素,再读取元素点里面的值
         */
        /**
         * 4.获取根元素
         * 注意：导包的时候导入import org.dom4j.Element;
         */
        Element root = doc.getRootElement();
        //System.out.println(root.getName()); //获取根元素的名字 companys

        /**
         * 5.通过根元素获取子元素的迭代器
         * 导入：
         * import java.util.Iterator;包
         * import org.dom4j.Attribute;包
         */
        Iterator<Element> it = root.elementIterator();

        DiTuResponse diTuResponse=new DiTuResponse();
        while(it.hasNext()){
            Element e = it.next();//获取子元素


            if(e.getName().trim().equalsIgnoreCase("parameters")){
                DiTiparameters tiparameters=new DiTiparameters();
                Element origElement = e.element("orig");
                //获取元素中的文本内容
                String orig = origElement.getText();
                tiparameters.setOrig(orig);
                Element destElement = e.element("dest");
                //获取元素中的文本内容
                String dest = destElement.getText();
                tiparameters.setDest(dest);
                Element midElement = e.element("mid");
                //获取元素中的文本内容
                String mid = midElement.getText();
                tiparameters.setMid(mid);
                Element widthElement = e.element("width");
                //获取元素中的文本内容
                String width = widthElement.getText();
                tiparameters.setWidth(width);
                Element heightElement = e.element("height");
                //获取元素中的文本内容
                String height = heightElement.getText();
                tiparameters.setHeight(height);
                Element styleElement = e.element("style");
                //获取元素中的文本内容
                String style = styleElement.getText();
                tiparameters.setStyle(style);
                diTuResponse.setParameters(tiparameters);

            }

            if(e.getName().trim().equalsIgnoreCase("routes")){
                List<DiTiItem>routes=new ArrayList<>();
                List<Element> listElement=e.elements();//所有一级子节点的list
                listElement.stream().forEach(element -> {
                    Attribute idAttr =element.attribute("id");
                      String id = idAttr.getValue();
                    DiTiItem diTiItem=new DiTiItem();
                    diTiItem.setId(id);
                    Element strguideElement = element.element("strguide");
                    diTiItem.setStrguide(strguideElement.getText());
                    Element signageElement = element.element("signage");
                    diTiItem.setSignage(signageElement.getText());

                    Element streetNameElement = element.element("streetName");
                    diTiItem.setStreetName(streetNameElement.getText());

                    Element nextStreetNameElement = element.element("nextStreetName");
                    diTiItem.setNextStreetName(nextStreetNameElement.getText());

                    Element tollStatusElement = element.element("tollStatus");
                    diTiItem.setTollStatus(tollStatusElement.getText());

                    Element turnlatlonElement = element.element("turnlatlon");
                    diTiItem.setTurnlatlon(turnlatlonElement.getText());
                    routes.add(diTiItem);

                });
                diTuResponse.setRoutes(routes);
            }

            if(e.getName().trim().equalsIgnoreCase("simple")){
                List<DiTiSimple>simpleList=new ArrayList<>();
                List<Element> listElement=e.elements();//所有一级子节点的list
                listElement.stream().forEach(element -> {
                    Attribute idAttr =element.attribute("id");
                    String id = idAttr.getValue();
                    DiTiSimple simple=new DiTiSimple();
                    simple.setId(id);
                    Element strguideElement = element.element("strguide");
                    simple.setStrguide(strguideElement.getText());

                    Element streetNamesElement = element.element("streetNames");
                    simple.setStreetNames(streetNamesElement.getText());

                    Element lastStreetNameElement = element.element("lastStreetName");
                    simple.setLastStreetName(lastStreetNameElement.getText());



                    Element linkStreetNameElement = element.element("linkStreetName");
                    simple.setLinkStreetName(linkStreetNameElement.getText());


                    Element signageElement = element.element("signage");
                    simple.setSignage(signageElement.getText());

                    Element tollStatusElement = element.element("tollStatus");
                    simple.setTollStatus(tollStatusElement.getText());

                    Element turnlatlonElement = element.element("turnlatlon");
                    simple.setTurnlatlon(turnlatlonElement.getText());

                    try {
                        Element streetLatLonElement = element.element("streetLatLon");
                        simple.setStreetLatLon(streetLatLonElement.getText());
                    }catch (Exception ex){
                        System.out.println("streetLatLon is empty");
                    }
                    Element streetDistanceElement = element.element("streetDistance");
                    simple.setStreetDistance(streetDistanceElement.getText());

                    Element segmentNumberElement = element.element("segmentNumber");
                    simple.setSegmentNumber(segmentNumberElement.getText());



                    simpleList.add(simple);
                });

                diTuResponse.setSimple(simpleList);

            }



            if(e.getName().trim().equalsIgnoreCase("distance")){
                diTuResponse.setDistance(e.getText());
            }

            if(e.getName().trim().equalsIgnoreCase("duration")){
                diTuResponse.setDuration(e.getText());
            }
            if(e.getName().trim().equalsIgnoreCase("routelatlon")){
                diTuResponse.setRoutelatlon(e.getText());
            }

            if(e.getName().trim().equalsIgnoreCase("mapinfo")){
                Mapinfo info=new Mapinfo();
                Element center=e.element("center");
                info.setCenter(center.getText());
                Element scale=e.element("scale");
                info.setScale(scale.getText());
                diTuResponse.setMapinfo(info);
            }

        }

        return diTuResponse;

    }

}
