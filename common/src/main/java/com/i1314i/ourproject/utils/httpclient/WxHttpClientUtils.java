package com.i1314i.ourproject.utils.httpclient;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.map.LinkedMap;
import org.apache.commons.io.IOUtils;
import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * @author 平行时空
 * @created 2018-07-13 23:00
 **/
public class WxHttpClientUtils {

    /**
     * 日志对象
     */
    protected static Logger logger = LoggerFactory.getLogger(WxHttpClientUtils.class);

    // http客户端
    private static DefaultHttpClient httpclient=new DefaultHttpClient();



    public static DefaultHttpClient getHttpclient() {
        return httpclient;
    }


    public static void setHttpclient(DefaultHttpClient httpclient) {
        WxHttpClientUtils.httpclient = httpclient;
    }

    /**
     * 尝试请求指定链接是否正常
     * @param client 客户端对象
     * @param url 请求的链接
     * @throws HttpException
     * @throws IOException
     */
    public static boolean testUrl(String url){
        return testUrl(createHttpClient(),url);
    }

    /**
     * 尝试请求指定链接是否正常
     * @param client 客户端对象
     * @param url 请求的链接
     * @throws HttpException
     * @throws IOException
     */
    public static boolean testUrl(HttpClient client,String url){
        HttpGet httpGet=new HttpGet(url);
        httpGet.addHeader("Content-Type", "text/html;charset=UTF-8");
        int statusCode = 0;
        try {
            HttpResponse response = client.execute(httpGet);
            statusCode = response.getStatusLine().getStatusCode();
        } catch (Exception e) {
            logger.error("HttpClient请求异常",e);
        } finally{
            httpGet.abort();
        }
        if(HttpStatus.SC_OK != statusCode){
            return false;
        }
        return true;
    }


    /**
     * 通过GET方法请求服务器文本数据
     * @param url 地址
     * @param parameters 参数
     * @return 结果文本
     * @throws HttpException
     * @throws IOException
     */
    public static String httpGetText(String url,LinkedMap<String,Object> parameters) throws HttpException, IOException{
        return httpGetText(createHttpClient(),url,parameters);
    }

    /**
     * 通过GET方法请求服务器文本数据
     * @param client http客户端
     * @param url 地址
     * @param parameters 参数
     * @return 结果文本
     * @throws HttpException
     * @throws IOException
     */
    public static String httpGetText(HttpClient client,String url,LinkedMap<String,Object> parameters) throws HttpException, IOException{
        if(parameters != null && parameters.size() > 0){
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            for(int i=0,len = parameters.size(); i < len; i++){
                Object v = parameters.getValue(i);
                if(v == null)
                    continue;
                String value = v.toString();
                String key = parameters.get(i);
                params.add(new BasicNameValuePair(key,value));
            }
            if(url.indexOf("?") > -1){
                url += "&" + URLEncodedUtils.format(params, "UTF-8");
            }else{
                url += "?" + URLEncodedUtils.format(params, "UTF-8");
            }
        }
        HttpGet httpGet=new HttpGet(url);
        httpGet.addHeader("Content-Type", "text/html;charset=UTF-8");
        try{
            HttpResponse response = client.execute(httpGet);
            InputStream  is = response.getEntity().getContent();
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            IOUtils.copy(is,os);
            return new String(os.toByteArray(),"UTF-8");
        }finally{
            httpGet.abort();
        }

    }

    /**
     * 通过POST方式向服务器发送数据
     * @param client http客户端
     * @param url 地址
     * @param parameters 参数集
     * @param attachs 附件列表
     * @return 返回结果
     * @throws HttpException
     * @throws IOException
     */
    public static String httpPostUpload(HttpClient client, String url, LinkedMap<String,Object> parameters, LinkedMap<String,File> attachs) throws HttpException, IOException{
        HttpPost httpPost=new HttpPost(url);
        HttpEntity entity = null;
        if(attachs != null && attachs.size() > 0){
            MultipartEntityBuilder multipartBuilder = MultipartEntityBuilder.create();
            multipartBuilder.setCharset(Charset.forName("UTF-8"));
            for(int i = 0,len = attachs.size(); i< len; i++){
                multipartBuilder.addBinaryBody(attachs.get(i), attachs.getValue(i));
            }
            if(parameters != null && parameters.size() > 0){
                for(int i=0,len = parameters.size(); i < len; i++){
                    Object v = parameters.getValue(i);
                    if(v == null)
                        continue;
                    String value = v.toString();
                    String key = parameters.get(i);
                    multipartBuilder.addTextBody(key, value);

                }
            }
            entity = multipartBuilder.build();
        }else if(parameters != null && parameters.size() > 0){
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            for(int i=0,len = parameters.size(); i < len; i++){
                Object v = parameters.getValue(i);
                if(v == null)
                    continue;
                String value = v.toString();
                String key = parameters.get(i);
                params.add(new BasicNameValuePair(key, value));
            }
            EntityBuilder builder = EntityBuilder.create();
            builder.setContentEncoding("UTF-8");
            builder.setParameters(params);
            entity = builder.build();
        }
        if(entity != null)
            httpPost.setEntity(entity);
        try {
            HttpResponse response = client.execute(httpPost);
            return EntityUtils.toString(response.getEntity(), "GBK");
        }finally{
            httpPost.abort();
        }
    }

    /**
     * 通过POST方式向服务器发送数据
     * @param url 地址
     * @param parameters 参数集
     * @param attachs 附件列表
     * @return 返回结果
     * @throws HttpException
     * @throws IOException
     */
    public static String httpPostUpload(String url, LinkedMap<String,Object> parameters, LinkedMap<String,File> attachs) throws HttpException, IOException{
        return httpPostUpload(createHttpClient(),url,parameters,attachs);
    }

    /**
     * 创建httpClient对象
     * @return httpClient对象
     */
    public static HttpClient createHttpClient(){
        return HttpClientBuilder.create().build();
    }



    /**
     * 模拟浏览器post提交
     * @param url
     * @return
     */
    public static HttpPost getPostMethod(String url) {
        HttpPost pmethod = new HttpPost(url); // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Accept", "*/*");
        pmethod.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        pmethod.addHeader("Host", "mp.weixin.qq.com");
        pmethod.addHeader("X-Requested-With", "XMLHttpRequest");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        return pmethod;
    }

    /**
     * 模拟浏览器GET提交
     * @param url
     * @return
     */
    public static HttpGet getGetMethod(String url) {
        HttpGet pmethod = new HttpGet(url);
        // 设置响应头信息
        pmethod.addHeader("Connection", "keep-alive");
        pmethod.addHeader("Cache-Control", "max-age=0");
        pmethod.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.0) ");
        pmethod.addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/;q=0.8");
        return pmethod;
    }

    /**
     * get方式模拟浏览器请求
     * @param url
     * @return
     */
    public static String getHttpGetReturnStr(String url)
    {

        HttpGet get = getGetMethod(url);
        String returnStr=null;
        try {
            HttpResponse response = getHttpclient().execute(get);
            returnStr = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            logger.info("#################   HttpGet请求出错");
        }
        return returnStr;
    }



    /**
     * post模拟浏览器请求，
     * @param url
     * @param entityJson
     * @return
     */
    public static String getHttpPostReturnStr(String url,String entityJson)
    {

        HttpPost httpost = HttpClientConnectionManager.getPostMethod(url);
        httpost.setEntity(new StringEntity(entityJson, "UTF-8"));
        String returnStr=null;
        try {

            HttpResponse response = getHttpclient().execute(httpost);
            returnStr = EntityUtils.toString(response.getEntity(), "utf-8");

        } catch (Exception e) {
            logger.info("#################   HttpPost请求出错");
        }
        return returnStr;
    }


    /**
     * 绕过验证
     *
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     */
    public static SSLContext createIgnoreVerifySSL() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sc = SSLContext.getInstance("SSLv3");

        // 实现一个X509TrustManager接口，用于绕过验证，不用修改里面的方法
        X509TrustManager trustManager = new X509TrustManager() {
            @Override
            public void checkClientTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(
                    java.security.cert.X509Certificate[] paramArrayOfX509Certificate,
                    String paramString) throws CertificateException {
            }

            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
        };

        sc.init(null, new TrustManager[] { trustManager }, null);
        return sc;
    }


    /**
     * 模拟请求
     *
     * @param url        资源地址
     * @param map    参数列表
     * @param encoding    编码
     * @return
     * @throws NoSuchAlgorithmException
     * @throws KeyManagementException
     * @throws IOException
     * @throws ClientProtocolException
     */
    public static String send(String url, Map<String,String> map, String encoding) throws KeyManagementException, NoSuchAlgorithmException, ClientProtocolException, IOException {
        String body = "";
        //采用绕过验证的方式处理https请求
        SSLContext sslcontext = createIgnoreVerifySSL();

        // 设置协议http和https对应的处理socket链接工厂的对象
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.INSTANCE)
                .register("https", new SSLConnectionSocketFactory(sslcontext))
                .build();
        PoolingHttpClientConnectionManager connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        HttpClients.custom().setConnectionManager(connManager);

        //创建自定义的httpclient对象
        CloseableHttpClient client = HttpClients.custom().setConnectionManager(connManager).build();
//        CloseableHttpClient client = HttpClients.createDefault();

        //创建post方式请求对象
        HttpPost httpPost = new HttpPost(url);

        //装填参数
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        if(map!=null){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }
        }
        //设置参数到请求对象中
        httpPost.setEntity(new UrlEncodedFormEntity(nvps, encoding));

        System.out.println("请求地址："+url);
        System.out.println("请求参数："+nvps.toString());

        //设置header信息
        //指定报文头【Content-type】、【User-Agent】
        httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
        httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");

        //执行请求操作，并拿到结果（同步阻塞）
        CloseableHttpResponse response = client.execute(httpPost);
        //获取结果实体
        HttpEntity entity = response.getEntity();
        if (entity != null) {
            //按指定编码转换结果实体为String类型
            body = EntityUtils.toString(entity, encoding);
        }
        EntityUtils.consume(entity);
        //释放链接
        response.close();
        return body;
    }

        /**
         * get请求
         * @return
         */
        public static String doGet(String url) {
            try {
                HttpClient client = new DefaultHttpClient();
                //发送get请求
                HttpGet request = new HttpGet(url);
                HttpResponse response = client.execute(request);

                /**请求发送成功，并得到响应**/
                if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    /**读取服务器返回过来的json字符串数据**/
                    String strResult = EntityUtils.toString(response.getEntity());

                    return strResult;
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

    public static String doGetBase(String baseurl) {
        try {

            URL url = new URL(baseurl);
            URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);

            HttpClient client = new DefaultHttpClient();
            //发送get请求
            client.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,60000);//连接时间
            client.getParams().setParameter(CoreConnectionPNames.SO_TIMEOUT,60000);//数据传输时间
            HttpGet request = new HttpGet(uri);

            HttpResponse response = client.execute(request);

            /**请求发送成功，并得到响应**/
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                String strResult = EntityUtils.toString(response.getEntity());

                return strResult;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

        /**
         * post请求(用于key-value格式的参数)
         * @param url
         * @param params
         * @return
         */
        public static String doPost(String url, Map params){

            BufferedReader in = null;
            try {
                // 定义HttpClient
                HttpClient client = new DefaultHttpClient();
                // 实例化HTTP方法
                HttpPost request = new HttpPost();
                request.setURI(new URI(url));

                //设置参数
                List<NameValuePair> nvps = new ArrayList<NameValuePair>();
                for (Iterator iter = params.keySet().iterator(); iter.hasNext();) {
                    String name = (String) iter.next();
                    String value = String.valueOf(params.get(name));
                    nvps.add(new BasicNameValuePair(name, value));

                    //System.out.println(name +"-"+value);
                }
                request.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

                HttpResponse response = client.execute(request);
                int code = response.getStatusLine().getStatusCode();
                if(code == 200){	//请求成功
                    in = new BufferedReader(new InputStreamReader(response.getEntity()
                            .getContent(),"utf-8"));
                    StringBuffer sb = new StringBuffer("");
                    String line = "";
                    String NL = System.getProperty("line.separator");
                    while ((line = in.readLine()) != null) {
                        sb.append(line + NL);
                    }

                    in.close();

                    return sb.toString();
                }
                else{	//
                    System.out.println("状态码：" + code);
                    return null;
                }
            }
            catch(Exception e){
                e.printStackTrace();

                return null;
            }
        }

        /**
         * post请求（用于请求json格式的参数）
         * @param url
         * @param params
         * @return
         */
        public static String doPost(String url, String params) throws Exception {

            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(url);// 创建httpPost
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-Type", "application/json");
            String charSet = "UTF-8";
            StringEntity entity = new StringEntity(params, charSet);
            httpPost.setEntity(entity);
            CloseableHttpResponse response = null;

            try {

                response = httpclient.execute(httpPost);
                StatusLine status = response.getStatusLine();
                int state = status.getStatusCode();
                if (state == HttpStatus.SC_OK) {
                    HttpEntity responseEntity = response.getEntity();
                    String jsonString = EntityUtils.toString(responseEntity);
                    return jsonString;
                }
                else{
                    logger.error("请求返回:"+state+"("+url+")");
                }
            }
            finally {
                if (response != null) {
                    try {
                        response.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }



    /**
     * 发起https请求并获取结果
     *
     * @param request 请求地址
     * @param RequestMethod 请求方式（GET、POST）
     * @param output 提交的数据
     * @return JSONObject(通过JSONObject.get(key)的方式获取json对象的属性值)
     */
    public static JSONObject HttpRequest(String request , String RequestMethod , String output ){
        @SuppressWarnings("unused")
        JSONObject jsonObject = null;
        StringBuffer buffer = new StringBuffer();
        try {
            //建立连接
            URL url = new URL(request);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestMethod(RequestMethod);
            if(output!=null){
                OutputStream out = connection.getOutputStream();
                out.write(output.getBytes("UTF-8"));
                out.close();
            }
            //流处理
            InputStream input = connection.getInputStream();
            InputStreamReader inputReader = new InputStreamReader(input,"UTF-8");
            BufferedReader reader = new BufferedReader(inputReader);
            String line;
            while((line=reader.readLine())!=null){
                buffer.append(line);
            }
            //关闭连接、释放资源
            reader.close();
            inputReader.close();
            input.close();
            input = null;
            connection.disconnect();
            jsonObject = JSONObject.parseObject(buffer.toString());
        } catch (Exception e) {
        }
        return jsonObject;
    }



}
