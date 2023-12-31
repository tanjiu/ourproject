package com.i1314i.ourproject.filter;

import com.alibaba.fastjson.JSONObject;

import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.log.ISysLogService;
import com.i1314i.ourproject.service.manger.TokenManager;
import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import com.i1314i.ourproject.utils.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 退出<br>
 * web退出和restful方式退出<br>
 * 后者会删除缓存的token
 *         2017年8月13日
 */
public class LogoutFilter extends org.apache.shiro.web.filter.authc.LogoutFilter {

	private static final Logger log = LoggerFactory.getLogger("logoutFilter");
	@Autowired
	private UserUtils userUtils;

	@Override
	protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
		String loginToken = RestfulFilter.getToken(request);
		userUtils=SpringUtil.getBean(UserUtils.class);
		User user = userUtils.getCurrentUser((HttpServletRequest) request);
		if (StringUtils.isBlank(loginToken)) {// 非Restful方式
			boolean flag = super.preHandle(request, response);
			log.debug("{}退出成功", user.getUsername());
			SpringUtil.getBean(ISysLogService.class).save(user.getUserId(), "退出", true, null);

			return flag;
		} else {
			TokenManager tokenManager = SpringUtil.getBean(TokenManager.class);
			boolean flag = tokenManager.deleteToken(loginToken);
			if (flag) {
				RestfulFilter.writeResponse(WebUtils.toHttp(response), HttpStatus.OK.value(), SUCCESS_INFO);
				log.debug("{}退出成功", user.getUsername());
			} else {
				RestfulFilter.writeResponse(WebUtils.toHttp(response), HttpStatus.BAD_REQUEST.value(), ERR_INFO);
			}

			SpringUtil.getBean(ISysLogService .class).save(user.getUserId(), "token方式退出", flag, null);

			return false;
		}
	}

	
	private static String SUCCESS_INFO = JSONObject.toJSONString(new ResultMap().code(HttpStatus.OK.value()+"").msg( "退出成功") );
	private static String ERR_INFO = JSONObject
			.toJSONString(new ResultMap().code(HttpStatus.BAD_REQUEST.value()+"").msg( "退出失败,token不存在"));

}
