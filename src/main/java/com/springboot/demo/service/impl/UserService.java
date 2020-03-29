package com.springboot.demo.service.impl;

import com.springboot.demo.pojo.UserForScanLoad;
import org.springframework.stereotype.Service;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 12:39
 * @Version 1.0
 */

@Service
public class UserService {
    public void printUser(UserForScanLoad user) {
        System.out.println("编号:" + user.getId());
        System.out.println("用户名称:" + user.getUserName());
        System.out.println("备注:" + user.getNote());
    }
}
