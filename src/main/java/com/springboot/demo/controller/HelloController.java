package com.springboot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wu Ming
 * @Date 2020/3/27 22:36
 * @Version 1.0
 */

@RestController
public class HelloController {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index() {
        return "Hello World!!!!wuming";
    }
}
