package com.springboot.demo.controller;

import com.springboot.demo.aspect.UserValidator;
import com.springboot.demo.pojo.User;
import com.springboot.demo.service.UserService;
import com.springboot.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 22:07
 * @Version 1.0
 * <p>
 * AOP
 */
@Controller
@RequestMapping("/user")
public class UserController {
    // 注入用户服务
    @Autowired
    private UserService userService = null;


    // 定义请求
    @RequestMapping("/vp")
    // 返回JSON
    @ResponseBody
    public User validateAndPrint(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        //强制转换
        UserValidator userValidator = (UserValidator) userService;
        // 验证用户是否为空
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }

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

    @RequestMapping("/manyAspects")
    public String manyAspects(Map<String,Object> map) {
        map.put("key","manyAspects");
        userService.manyAspects();
        return "manyAspects";
    }
}
