package com.baiyue.web;


import javax.servlet.http.HttpServletRequest;

import com.baiyue.vo.result.LoginSuccessCtsUserInfo;
import com.baiyue.vo.result.LoginSuccessWebUserInfo;
import com.utils_max.ParseUtils;
import com.utils_max.redis.RedisUtil;

public class BaseWebAction {
	
	/**
	 * 获取web用户登陆信息
	 * @author max
	 * @date:   2018年9月19日
	 * @Desc :
	 * @param request
	 * @return
	 */
	public LoginSuccessWebUserInfo getLoginSuccessWebUserInfo(HttpServletRequest request ){
		LoginSuccessWebUserInfo loginResult = null;
		String token= request.getParameter("accessToken");
		if(!ParseUtils.isEmpty(token)){
			 loginResult=(LoginSuccessWebUserInfo)RedisUtil.getObject(token);
		}
		return loginResult;
	}
	
	/**
	 * 获取cts用户登陆信息
	 * @author max
	 * @date:   2018年9月19日
	 * @Desc :
	 * @param request
	 * @return
	 */
	public LoginSuccessCtsUserInfo getLoginSuccessCtsUserInfo(HttpServletRequest request){
		LoginSuccessCtsUserInfo loginResult = null;
		String token= request.getParameter("accessToken");
		if(!ParseUtils.isEmpty(token)){
			 loginResult=(LoginSuccessCtsUserInfo)RedisUtil.getObject(token);
		}
		return loginResult;
	}
	
}
