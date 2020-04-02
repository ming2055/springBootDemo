package com.springboot.demo.aspect.impl;

import com.springboot.demo.aspect.UserValidator;
import com.springboot.demo.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 21:43
 * @Version 1.0
 * <p>
 * AOP
 */

@Aspect
public class MyAspect {
    //引入增强功能的类
    @DeclareParents(value= "com.springboot.demo.service.impl.UserServiceImpl",defaultImpl=UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {
    }

    //通知获取参数
    // @Before("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    @Before("pointCut()&& args(user)")
    public void before(JoinPoint point, User user) {
        Object[] args = point.getArgs();
        System.out.println("before ......");
    }

    // @After("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    @After("pointCut()")
    public void after() {
        System.out.println("after ......");
    }

    // @AfterReturning("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    // @AfterThrowing("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before......");
        //回调目标对象的原有方法
        jp.proceed();
        System.out.println("around after......");
    }
}
