package com.example.springbootdemo;

import com.example.springbootdemo.interceptor.AccessInterceptor;
import com.example.springbootdemo.interceptor.CommonInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Resource
    private AccessInterceptor accessInterceptor;

    @Resource
    private CommonInterceptor commonInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        // 自定义拦截器，添加拦截器路径和排除拦截器路径
        registry.addInterceptor(commonInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("");

        registry.addInterceptor(accessInterceptor)
                .addPathPatterns("/**");
    }

}
