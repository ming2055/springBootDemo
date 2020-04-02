package com.springboot.demo.controller;

import com.springboot.demo.pojo.User;
import com.springboot.demo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Wu Ming
 * @Date 2020/4/2 21:17
 * @Version 1.0
 */
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {
    @Autowired
    private MyBatisUserService myBatisUserService = null;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id) {
        User user = myBatisUserService.getUser(id);
        System.out.println(user.getUserName());
        return user;
    }
}
