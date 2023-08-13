package com.i1314i.ourproject.filter;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.UserFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author 平行时空
 * @created 2018-12-13 23:46
 **/
public class CasUrlFilter extends UserFilter {
    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {



       // Subject subjects = getSubject(request, response);
        String url = getPathWithinApplication(request);
        System.out.println("url:"+url);

        if (url.indexOf("login")>0){
            return false;
        }

        return super.isAccessAllowed(request, response, mappedValue);
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return super.onAccessDenied(request, response);
    }
}
