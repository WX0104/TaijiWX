package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class CorsConfig extends WebMvcConfigurationSupport {
 /*
    //跨域配置
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowCredentials(true)
            .allowedMethods("GET", "POST", "DELETE", "PUT");
            
    }
 */
	/*
    //拦截器配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //这里可以添加多个拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
 */

}
