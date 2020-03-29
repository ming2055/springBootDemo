package com.springboot.demo.testAOP;

import com.springboot.demo.interceptor.MyInterceptor;
import com.springboot.demo.proxy.ProxyBean;
import com.springboot.demo.service.HelloService;
import com.springboot.demo.service.impl.HelloServiceImpl;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 19:52
 * @Version 1.0
 *
 * AOP
 */
public class TestProxy {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        // 按约定获取proxy
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(
                helloService, new MyInterceptor());
        proxy.sayHello("zhangsan");
        System.out.println("\n###############name is null!!#############\n");
        proxy.sayHello(null);
    }
}
