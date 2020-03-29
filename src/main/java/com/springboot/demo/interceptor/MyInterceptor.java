package com.springboot.demo.interceptor;

import com.springboot.demo.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 19:27
 * @Version 1.0
 *
 * AOP
 */
public class MyInterceptor implements Interceptor {
    @Override
    public boolean before() {
        System.out.println("before ......");
        return true;
    }

    @Override
    public void after() {
        System.out.println("after .......");
    }

    @Override
    public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("around before ......");
        Object obj = invocation.proceed();
        System.out.println("around after ......");
        return obj;
    }

    @Override
    public void afterReturning() {
        System.out.println("afterReturning .......");
    }

    @Override
    public void afterThrowing() {
        System.out.println("afterThrowing ........");
    }

    @Override
    public boolean useAround() {
        return true;
    }
}