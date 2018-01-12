package com.chenchao.controller;

import com.chenchao.bean.NewBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by T005 on 2018/1/5.
 */
@RestController
@EnableConfigurationProperties
@RequestMapping("/")
public class NewController {
    @Autowired
    NewBean newBean;

    @Value("${hello.chenchao.name}")
    private String name;

    @Value("${profiles.env.max}")
    private int number;

    @RequestMapping("abc")
    public String NewController(){
        return newBean.getValue();
    }
    @RequestMapping("hello")
    public String hello(){
        return name;
    }
    @RequestMapping("env")
    public long env(){
        return number;
    }
}
