package com.example.wiki.controller;


import com.example.wiki.domain.Demo;
import com.example.wiki.domain.Test;
import com.example.wiki.service.DemoService;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Autowired
    private DemoService demoService;



    @GetMapping("list")
    public List<Demo> list(){
        return demoService.list();
    }
}
