package com.springboot.demo.controller;

import com.springboot.demo.pojo.User;
import com.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 22:07
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // 注入用户服务
    @Autowired
    private UserService userService = null;

    // 定义请求
    @RequestMapping("/print")
    // 转换为JSON
    @ResponseBody
    public User printUser(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        userService.printUser(user);// 若user=null，则执行afterthrowing方法
        return user;//加入断点
    }
}
