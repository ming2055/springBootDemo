package com.springboot.demo.aspect.impl;

import com.springboot.demo.aspect.UserValidator;
import com.springboot.demo.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @Author Wu Ming
 * @Date 2020/3/30 19:56
 * @Version 1.0
 *
 * AOP
 */

@Component
public class UserValidatorImpl implements UserValidator {

    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口：" + UserValidator.class.getSimpleName());
        return user != null;
    }
}
