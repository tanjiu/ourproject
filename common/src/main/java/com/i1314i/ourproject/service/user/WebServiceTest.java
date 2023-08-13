package com.i1314i.ourproject.service.user;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.IOUtils;
import com.alibaba.fastjson.JSON;
import com.i1314i.ourproject.utils.encode.MD5Util;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

/**
 * @author 平行时空
 * @created 2018-11-02 20:56
 **/
public class WebServiceTest {


    public String invokeRemoteFuc() {
        String endpoint = "http://121.41.122.62/CommonService/MService.asmx";
        String result = "no result!";
        Service service = new Service();
        Call call;
        Object[] object = new Object[4];
        String strToken="";
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        strToken=format.format(date)+"040170090001006263";
        strToken=MD5Util.encrypt(strToken.getBytes());
        object[0] = strToken;//Object是用来存储方法的参数
        object[1] = "040170090001006263";//Object是用来存储方法的参数
        object[2] = "2018-01-01";//Object是用来存储方法的参数
        object[3] = "2018-11-01";//Object是用来存储方法的参数

        try {
            call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(endpoint));// 远程调用路径

            call.setUseSOAPAction(true);
            call.setSOAPActionURI("http://tempuri.org/GetFarmsCheckData");

//	        call.setOperationName("GetFarmsCheckData");// 调用的方法名
            call.setOperationName(new QName("http://tempuri.org/","GetFarmsCheckData"));


            // 设置参数名:
            call.addParameter(new QName("http://tempuri.org/GetFarmsCheckData","strToken"), // 参数名
                    XMLType.XSD_STRING,// 参数类型:String
                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
            call.addParameter(new QName("http://tempuri.org/GetFarmsCheckData","FarmID"), // 参数名
                    XMLType.XSD_STRING,// 参数类型:String
                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
            call.addParameter(new QName("http://tempuri.org/GetFarmsCheckData","StartTime"), // 参数名
                    XMLType.XSD_STRING,// 参数类型:String
                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'
            call.addParameter(new QName("http://tempuri.org/GetFarmsCheckData","EndTime"), // 参数名
                    XMLType.XSD_STRING,// 参数类型:String
                    ParameterMode.IN);// 参数模式：'IN' or 'OUT'

            // 设置返回值类型：
            call.setReturnType(XMLType.XSD_STRING);// 返回值类型：String
            System.out.println(call.getSOAPActionURI());
            result = (String) call.invoke(new Object[]{strToken,"040170090001006263","",""});// 远程调用
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
        String strToken=format.format(date)+"040170090001006263";
        strToken=MD5Util.encrypt(strToken.getBytes());
        System.out.println(strToken);
        String urlStr = "http://121.41.122.62/CommonService/MService.asmx";
        try {

            String wsdl = "http://localhost:9000/HelloWorld?wsdl";
            int timeout = 10000;
            StringBuffer sb = new StringBuffer("");
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            sb.append("<soap:Envelope "
                    + "xmlns:api='http://demo.ls.com/' "
                    + "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' "
                    + "xmlns:xsd='http://www.w3.org/2001/XMLSchema' "
                    + "xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>");
            sb.append("<soap:Body>");
            sb.append("<GetFarmsCheckData xmlns='http://tempuri.org/'>");
            sb.append("<strToken>"+strToken+"</strToken>");
            sb.append("<FarmID>040170090001006263</FarmID>");
            sb.append("<StartTime>20181001</StartTime>");
            sb.append("<EndTime>20181101</EndTime>");
            sb.append("</GetFarmsCheckData>");
            sb.append("</soap:Body>");
            sb.append("</soap:Envelope>");



            // HttpClient发送SOAP请求
            System.out.println("HttpClient 发送SOAP请求");
            HttpClient client = new HttpClient();
            PostMethod postMethod = new PostMethod(urlStr);
            // 设置连接超时
            client.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
            // 设置读取时间超时
            client.getHttpConnectionManager().getParams().setSoTimeout(timeout);
            // 然后把Soap请求数据添加到PostMethod中
            RequestEntity requestEntity = new StringRequestEntity(sb.toString(), "text/xml", "UTF-8");
            //设置请求头部，否则可能会报 “no SOAPAction header” 的错误
            postMethod.setRequestHeader("SOAPAction","http://tempuri.org/GetFarmsCheckData");
            // 设置请求体
            postMethod.setRequestEntity(requestEntity);
            int status = client.executeMethod(postMethod);
            // 打印请求状态码
            System.out.println("status:" + status);
            // 获取响应体输入流
            InputStream is = postMethod.getResponseBodyAsStream();
            // 获取请求结果字符串
            String result = IOUtils.toString(is);
            System.out.println("result: " + result);



            // HttpURLConnection 发送SOAP请求
            System.out.println("HttpURLConnection 发送SOAP请求");
            URL url = new URL(wsdl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            conn.setRequestMethod("POST");
            conn.setUseCaches(false);
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setConnectTimeout(timeout);
            conn.setReadTimeout(timeout);

            DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
            dos.write(sb.toString().getBytes("utf-8"));
            dos.flush();


            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            String line = null;
            StringBuffer strBuf = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                strBuf.append(line);
            }
            dos.close();
            reader.close();

            System.out.println(strBuf.toString());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        WebServiceTest t = new WebServiceTest();
        String result = t.invokeRemoteFuc();
        System.out.println(result);



        try {
//            String urlStr = "http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx";
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
            con.setRequestProperty("SOAPAction", "http://tempuri.org/GetFarmsCheckData");
            OutputStream oStream = con.getOutputStream();
            //下面这行代码是用字符串拼出要发送的xml，xml的内容是从测试软件里拷贝出来的
            //需要注意的是，有些空格不要弄丢哦，要不然会报500错误的。
            //参数什么的，你可以封装一下方法，自动生成对应的xml脚本
            StringBuffer sb = new StringBuffer("");
            sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            sb.append("<soap:Envelope "
                    + "xmlns:api='http://demo.ls.com/' "
                    + "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' "
                    + "xmlns:xsd='http://www.w3.org/2001/XMLSchema' "
                    + "xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'>");
            sb.append("<soap:Body>");
            sb.append("<GetFarmsCheckData xmlns='http://tempuri.org/'>");
            sb.append("<strToken>"+strToken+"</strToken>");
            sb.append("<FarmID>040170090001006263</FarmID>");
            sb.append("<StartTime>20181001</StartTime>");
            sb.append("<EndTime>20181101</EndTime>");
            sb.append("</GetFarmsCheckData>");
            sb.append("</soap:Body>");
            sb.append("</soap:Envelope>");
            oStream.write(sb.toString().getBytes());
            oStream.close();

            InputStream iStream = con.getInputStream();
            Reader reader = new InputStreamReader(iStream);

            int tempChar;
            String str = new String();
            while((tempChar = reader.read()) != -1){
                str += (char) tempChar;
            }
            //下面这行输出返回的xml到控制台，相关的解析操作大家自己动手喽。
            //如果想要简单的话，也可以用正则表达式取结果出来。
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>returnedxmlstr:"+str);
            iStream.close();
            oStream.close();
            con.disconnect();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
