package com.springboot.demo.config;

import com.springboot.demo.pojo.UserForScanLoad;
import com.springboot.demo.service.impl.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 11:43
 * @Version 1.0
 */
public class IoCTestForScanLoad {
    private static Logger log = LoggerFactory.getLogger(IoCTestForScanLoad.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigForScanLoad.class);
        UserService userService = ctx.getBean(UserService.class);
        UserForScanLoad user = ctx.getBean(UserForScanLoad.class);
        log.info(user.getId().toString());
        log.warn(userService.toString());
        userService.printUser(user);
        log.warn(ctx.containsBean("userService")?"1":"0");

    }
}
