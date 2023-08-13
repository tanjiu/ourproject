package com.i1314i.ourproject.filter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.i1314i.ourproject.po.Code;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.service.manger.TokenManager;
import com.i1314i.ourproject.service.status.UserConstants;
import com.i1314i.ourproject.shiro.token.CaptchaUsernamePasswordToken;
import com.i1314i.ourproject.utils.images.VerifyCodeUtils;
import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClient;
import com.i1314i.ourproject.utils.redisToken.TokenUtils;
import com.i1314i.ourproject.utils.spring.SpringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.i1314i.ourproject.utils.redisToken.TokenUtils.newImgToken;

/**
 * Restful方式登陆<br>
 * 在参数中或者header里加参数login-token作为登陆凭证<br>
 * 参数值是登陆成功后的返回值中获取
 *
 */


public class RestfulFilter extends UserFilter {
	private IJedisClient jedisClient=new JedisClient();
	private ResultMap resultMap=new ResultMap();
	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
		String loginToken = getToken(request);
		if (StringUtils.isBlank(loginToken)) {// 非Restful方式
			return super.isAccessAllowed(request, response, mappedValue);
		}

		TokenManager tokenManager = SpringUtil.getBean(TokenManager.class);
		User token = tokenManager.getToken(loginToken);
		if (token != null) {
			try {
				Subject subject = getSubject(request, response);
				if (subject.getPrincipal() == null) {
					String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
					//存入redis
					String gettoken= TokenUtils.makeToken();
					String newgettoken=TokenUtils.newImgToken(gettoken);
					//删除以前的
					jedisClient.set(newgettoken,verifyCode,60*15); //15分钟
					Code code=new Code(gettoken,verifyCode);
					CaptchaUsernamePasswordToken usernamePasswordToken = new CaptchaUsernamePasswordToken(token.getUsername(), token.getPassword(),code);
					subject.login(usernamePasswordToken);
					Subject subjects = getSubject(request, response);
					System.out.println(JSON.toJSONString(subjects));
				}

				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	/**
	 * 根据参数或者header获取login-token
	 * 
	 * @param request
	 * @return
	 */
	public static String getToken(ServletRequest request) {
		HttpServletRequest httpServletRequest = WebUtils.toHttp(request);
		String loginToken = httpServletRequest.getParameter(UserConstants.LOGIN_TOKEN);
		if (StringUtils.isBlank(loginToken)) {
			loginToken = httpServletRequest.getHeader(UserConstants.LOGIN_TOKEN);
		}
		return loginToken;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		String loginToken = getToken(request);
		if (StringUtils.isBlank(loginToken)) {
			return super.onAccessDenied(request, response);
		}

		writeResponse(WebUtils.toHttp(response), HttpStatus.UNAUTHORIZED.value(), info);
		return false;
	}

	private static String info = JSONObject
			.toJSONString(new ResultMap().code(HttpStatus.UNAUTHORIZED.value()+"").msg("token不存在或者过期"));

	public static void writeResponse(HttpServletResponse response, int status, String json) {
		try {
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Methods", "*");
			response.setContentType("application/json;charset=UTF-8");
			response.setStatus(status);
			response.getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
