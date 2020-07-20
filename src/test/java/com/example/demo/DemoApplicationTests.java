package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {


    // ioc容器
    @Autowired
    ApplicationContext ioc;

    @Test
    void ioc(){
        ioc.containsBean("");
    }

    @Test
    void contextLoads() {
    }

}
