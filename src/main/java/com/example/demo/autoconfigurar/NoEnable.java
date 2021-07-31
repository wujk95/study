package com.example.demo.autoconfigurar;

import com.example.demo.entity.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoEnable {

    @Autowired
    Hello hello;

    public String myName(){
        System.out.println(hello.getName() + 1);
        return hello.getName();
    }
}
