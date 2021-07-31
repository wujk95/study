package com.example.demo.autoconfigurar;

import com.example.demo.entity.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(Hello.class)
@Configuration
public class AutoName {

    @Autowired
    Hello hello;

    public String myName(){
        System.out.println(hello.getName());
        return hello.getName();
    }
}
