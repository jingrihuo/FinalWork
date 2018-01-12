package com.edu.zucc.yj.finalwork.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: FinalWork
 * @ClassName: SuperUserHandlerIntercepter
 * @Description: 超级管理员拦截器
 * @Author: YuJing
 * @CreateDate: 2018/1/12
 */
public class SuperUserHandlerIntercepter implements HandlerInterceptor{
    private static final String MAIN_URL = "/FinalWork/index.html";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("调用了超级管理员拦截器");
        if(!request.getSession().getAttribute("userState").toString().equals("管理员")) {
            response.sendRedirect(MAIN_URL);
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
