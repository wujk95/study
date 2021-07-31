package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjk
 * @Description
 * @create 2020-07-20T9:38
 */

@RestController
public class HelloController {

//     转发  前端并没有改变地址
    @RequestMapping({"/", "index.html"})
    public String redirect(){
        String h;
        String myName;
        String her;
        String his;
//        1

        return "index";
    }


}
