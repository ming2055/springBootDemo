package com.springboot.demo.service.impl;

import com.springboot.demo.service.HelloService;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 19:19
 * @Version 1.0
 * <p>
 * AOP
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || "".equals(name.trim())) {
            throw new RuntimeException("parameter is null !!");
        }
        System.out.println("hello " + name);
    }
}
