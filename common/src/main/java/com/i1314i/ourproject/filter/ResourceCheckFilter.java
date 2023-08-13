package com.i1314i.ourproject.filter;

import com.i1314i.ourproject.po.shiro.Permission;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * shiro资源路径拦截
 * @author 平行时空
 * @created 2018-11-02 17:44
 **/
public class ResourceCheckFilter extends AccessControlFilter {

    private List<Permission> permissions;

    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception {
        Subject subject = getSubject(servletRequest,servletResponse);
        String url = getPathWithinApplication(servletRequest);
        url=url.substring(1,url.length());
        return subject.isPermitted(url);
    }



    public ResourceCheckFilter() {

    }

    public ResourceCheckFilter(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        HttpServletRequest request =(HttpServletRequest) servletRequest;
        HttpServletResponse response =(HttpServletResponse) servletResponse;
        response.getWriter().println("error");

        // 返回 false 表示已经处理，例如页面跳转啥的，表示不在走以下的拦截器了（如果还有配置的话）
        return false;
    }

//    @Override
//    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) throws IOException {
//        if(!super.isAccessAllowed(request, response, mappedValue)){
//
//        }
//
//        return true;
//    }


}
