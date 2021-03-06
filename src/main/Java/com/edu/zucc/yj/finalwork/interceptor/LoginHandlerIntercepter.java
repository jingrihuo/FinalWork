package com.edu.zucc.yj.finalwork.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: FinalWork
 * @ClassName: LoginHandlerIntercepter
 * @Description: 用户登录拦截器
 * @Author: YuJing
 * @CreateDate: 2018/1/10
 */

public class LoginHandlerIntercepter implements HandlerInterceptor{
    private static final String LOGIN_URL = "/FinalWork/login.html";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        if(request.getSession().getAttribute("userId") == null) {
            System.out.println("调用了用户登录拦截器");
            response.sendRedirect(LOGIN_URL);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
