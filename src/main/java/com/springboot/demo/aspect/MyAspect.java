package com.springboot.demo.aspect;

import org.aspectj.lang.annotation.*;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 21:43
 * @Version 1.0
 *
 * AOP
 */

@Aspect
public class MyAspect {

    @Pointcut("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    public void pointCut() {
    }

    // @Before("execution(* com.springboot.demo.service.impl.UserServiceImpl.printUser(..))")
    @Before("pointCut()")
    public void before() {
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
}
