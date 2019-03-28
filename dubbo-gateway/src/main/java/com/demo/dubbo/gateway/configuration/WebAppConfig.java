package com.demo.dubbo.gateway.configuration;

import com.demo.dubbo.gateway.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Krystal on 2019/3/28.
 * WebMvcConfigurerAdaper用于进行WebMVC环境中的相关配置，通过对
 * addInterceptors()方法重写可以使之前编写好的拦截器生效。
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
