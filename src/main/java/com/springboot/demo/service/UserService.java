package com.springboot.demo.service;

import com.springboot.demo.pojo.User;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 21:36
 * @Version 1.0
 *
 * AOP
 */
public interface UserService {
    public void printUser(User user);

    public void manyAspects();
}
