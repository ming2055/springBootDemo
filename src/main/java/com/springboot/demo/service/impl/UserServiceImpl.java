package com.springboot.demo.service.impl;

import com.springboot.demo.pojo.User;
import com.springboot.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 21:38
 * @Version 1.0
 *
 * AOP
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if (user.getId() == null) {
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.print("id =" + user.getId());
        System.out.print("\tusername =" + user.getUserName());
        System.out.println("\tnote =" + user.getNote());
    }
}
