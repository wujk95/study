package com.example.demo.config;

import com.example.demo.entity.Hello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author wjk
 * @Description 重定向
 * @create 2020-07-13T13:01
 */

// 需要添加该注解才可以成功注册类内的bean
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Bean
    public Hello hello(){
        System.out.println("添加成功");
        return new Hello();
    }


    // 转发  前端并没有改变地址
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("index");
//        registry.addViewController("/index.html").setViewName("index");
//    }
//
//    @Bean
//    public WebMvcConfigurer redirect(){
//        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index.html").setViewName("index");
//            }
//        };
//        return  webMvcConfigurer;
//    }
}
