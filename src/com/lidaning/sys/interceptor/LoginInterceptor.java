package com.lidaning.sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lidaning.sys.base.Global;
import com.lidaning.sys.user.bean.UserInfo;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object obj) throws Exception {
		//获取请求的RUi:去除http:localhost:8080这部分剩下的
		String uri = req.getRequestURI();
		if(uri.contains("login")||uri.contains("logon")) {
			return true;
		}
		
		//获取session
		HttpSession session = req.getSession();
		UserInfo user = (UserInfo) session.getAttribute(Global.SESSION_USER);
		//判断session中是否有用户数据，如果有，则返回true，继续向下执行
		if (user != null) {
		    return true;
		}
		
		//不符合条件的给出提示信息，并转发到登录页面
		req.setAttribute("error", "您还没有登录，请先登录！");
		req.getRequestDispatcher("/jsp/user/login.jsp").forward(req, resp);
		return false;
	}

}
