package com.springboot.demo.interceptor;

import com.springboot.demo.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 19:22
 * @Version 1.0
 *
 * AOP
 */
public interface Interceptor {
    // 事前方法
    public boolean before();

    // 事后方法
    public void after();

    /**
     * 　　 * 取代原有事件方法
     * 　　 * @param invocation -- 回调参数，可以通过它的proceed方法，回调原有事件
     * 　　 * @return 原有事件返回对象
     * 　　 * @throws InvocationTargetException
     * 　　 * @throws IllegalAccessException
     *
     */
    public Object around(Invocation invocation)
            throws InvocationTargetException, IllegalAccessException;

    // 是否返回方法。事件没有发生异常执行
    public void afterReturning();

    // 事后异常方法，当事件发生异常后执行
    public void afterThrowing();

    // 是否使用around方法取代原有方法
    boolean useAround();
}
