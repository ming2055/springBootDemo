package com.springboot.demo.aspect;

import com.springboot.demo.pojo.User;

/**
 * @Author Wu Ming
 * @Date 2020/3/30 19:55
 * @Version 1.0
 *
 * AOP
 */
public interface UserValidator {
    // 检测用户对象是否为空
    public boolean validate(User user);
}
