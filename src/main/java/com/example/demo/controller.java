package com.example.demo;

import com.example.demo.autoconfigurar.AutoName;
import com.example.demo.autoconfigurar.NoEnable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class controller {

    @Autowired
    AutoName autoName;

    @Autowired
    NoEnable enable;

    @RequestMapping("/hello")
    public void myName(@RequestParam MultiValueMap s){
        autoName.myName();
        enable.myName();
    }
}
