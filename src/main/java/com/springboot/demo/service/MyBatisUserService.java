package com.springboot.demo.service;

import com.springboot.demo.pojo.User;

/**
 * @Author Wu Ming
 * @Date 2020/4/2 21:14
 * @Version 1.0
 */
public interface MyBatisUserService {
    public User getUser(Long id);
}
