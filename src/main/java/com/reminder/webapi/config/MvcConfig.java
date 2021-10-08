package com.reminder.webapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        viewControllerRegistry.addViewController("/index").setViewName("index");
        viewControllerRegistry.addViewController("/").setViewName("index");
        viewControllerRegistry.addViewController("/login").setViewName("login");

    }
}
