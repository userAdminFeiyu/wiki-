package com.example.wiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    //405 请求方式不支持
    //404 请求访问不到
    @GetMapping("/hello")
//    @RequestMapping("/hello") //表示支持所有的请求方式
    public String hello() {
        return "hello world";
    }

    @PostMapping("/hello/post/")
    public String helloPost(String name) {
        return "hello post!!" + name;
    }
}
