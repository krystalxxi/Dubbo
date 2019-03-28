package com.demo.dubbo.gateway.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Krystal on 2019/3/28.
 */
public class RequestInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3) throws Exception{

        String token = var1.getParameter("token");
        if (null != token && token.equals("1")){
            return true;
        }else{
            return false;
        }
    }

    public void postHandle(HttpServletRequest var1, HttpServletResponse var2, Object var3, ModelAndView var4) throws Exception{

    }

    public void afterCompletion(HttpServletRequest var1, HttpServletResponse var2, Object var3, Exception var4) throws Exception{

    }

}
