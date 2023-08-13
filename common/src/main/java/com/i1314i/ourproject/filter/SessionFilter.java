package com.i1314i.ourproject.filter;

import com.i1314i.ourproject.po.CommonMsg;
import com.i1314i.ourproject.shiro.token.IToken;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author 平行时空
 * @created 2018-11-23 12:12
 **/
public class SessionFilter  extends BasicHttpAuthenticationFilter{
    Logger logger= LoggerFactory.getLogger(TokenFilter.class);
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //判断请求的请求头是否带上 "Token"
        if (isLoginAttempt(request, response)) {
            //如果存在，则进入 executeLogin 方法执行登入，检查 token 是否正确
            try {
                executeLogin(request, response);
                return true;
            } catch (Exception e) {
                //token 错误
                //responseError(response, e.getMessage());
                CommonMsg msg=new CommonMsg("113","token is error");
                try {
                    responseMsg(response, msg.msgJson());
                } catch (IOException e1) {
                    System.out.println("error");
                }
            }
        }else {
//            Subject subject = SecurityUtils.getSubject();
////            subject.
////            Map<String,String> urlMap=factory.getFilterChainDefinitionMap();
//            HttpServletRequest httpServletRequest= (HttpServletRequest) request;
//            String url= httpServletRequest.getRequestURI();
//            System.out.println(url);
//            AccessControlFilter
//            CommonMsg msg=new CommonMsg("404","resources is not found");
//            try {
//                responseMsg(response, msg.msgJson());
//            } catch (Exception e) {
//                System.out.println("error");
//            }
        }

        //如果请求头不存在 Token，则可能是执行登陆操作或者是游客状态访问，无需检查 token，直接返回 true
        return true;
    }

    /**
     * 执行登陆操作
     */
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String token = httpServletRequest.getHeader("token");
        System.out.println(token);
        IToken iToken = new IToken(token);
        // 提交给realm进行登入，如果错误他会抛出异常并被捕获
        getSubject(request, response).login(iToken);
        // 如果没有抛出异常则代表登入成功，返回true
        return true;
    }


    /**
     * 拦截所有非携带token请求 备用类
     * @param request
     * @param response
     * @param mappedValue
     * @return
     */

    protected boolean isAccessAllowedTwo(ServletRequest request, ServletResponse response, Object mappedValue) {
        //判断请求的请求头是否带上 "Token"
        if (isLoginAttempt(request, response)) {
            //如果存在，则进入 executeLogin 方法执行登入，检查 token 是否正确
            try {
                executeLogin(request, response);
                return true;
            } catch (Exception e) {
                //token 错误
                responseError(response, e.getMessage());
            }
        }else {
            CommonMsg msg=new CommonMsg("404","resources is not found");
            try {
                responseMsg(response, msg.msgJson());
            } catch (Exception e) {
                System.out.println("error");
            }
        }

        //如果请求头不存在 Token，则可能是执行登陆操作或者是游客状态访问，无需检查 token，直接返回 true
        return false;
    }



    /**
     * 判断用户是否想要登入。
     * 检测 header 里面是否包含 Token 字段
     */
    @Override
    protected boolean isLoginAttempt(ServletRequest request, ServletResponse response) {
        HttpServletRequest req = (HttpServletRequest) request;
        String token = req.getHeader("token");
        return token != null;
    }

    /**
     * 对跨域提供支持
     */
//    @Override
//    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
//        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
//        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
//        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
//        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
//            httpServletResponse.setStatus(HttpStatus.OK.value());
//            return false;
//        }
//        return super.preHandle(request, response);
//    }

    /**
     * 将非法请求跳转到 /unauthorized/**
     */
    private void responseError(ServletResponse response, String message) {
        try {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            //设置编码，否则中文字符在重定向时会变为空字符串
            message = URLEncoder.encode(message, "UTF-8");
            httpServletResponse.sendRedirect("/unauthorized/" + message);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
    }

    public void responseMsg(ServletResponse response,String msg) throws IOException {
        HttpServletResponse rep = (HttpServletResponse) response;
        PrintWriter writer = null;
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(response.getOutputStream(),
                    "UTF-8");
            writer = new PrintWriter(osw, true);

            writer.write(msg);
            writer.flush();
            writer.close();
            // osw.close();
        } catch (UnsupportedEncodingException e) {
            logger.error("过滤器返回信息失败:" + e.getMessage(), e);
        } catch (IOException e) {
            logger.error("过滤器返回信息失败:" + e.getMessage(), e);
        } finally {
            if (null != writer) {
                writer.close();
            }
            if (null != osw) {
                //   osw.close();
            }
        }
    }

}
