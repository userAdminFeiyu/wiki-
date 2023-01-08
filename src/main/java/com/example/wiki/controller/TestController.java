package com.example.wiki.controller;


import com.example.wiki.domain.Test;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Autowired
    private TestService testService;


    //405 请求方式不支持
    //404 请求访问不到
    @GetMapping("/hello")
//    @RequestMapping("/hello") //表示支持所有的请求方式
    public String hello() {
        return "hello world" + testHello;
    }

    @PostMapping("/hello/post/")
    public String helloPost(String name) {
        return "hello post!!" + name;
    }


    @GetMapping("test/list")
    public List<Test> list(){
        return testService.list();
    }
}
