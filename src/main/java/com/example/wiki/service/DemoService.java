package com.example.wiki.service;

import com.example.wiki.domain.Demo;
import com.example.wiki.domain.Test;
import com.example.wiki.mapper.DemoMapper;
import com.example.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoMapper demoMapper;


    public List<Demo> list(){

        return demoMapper.selectByExample(null);
    }
}
