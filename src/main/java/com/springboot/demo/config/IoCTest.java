package com.springboot.demo.config;

import com.springboot.demo.pojo.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * @Author Wu Ming
 * @Date 2020/3/28 10:43
 * @Version 1.0
 */
public class IoCTest {
    private static Logger log = LoggerFactory.getLogger(IoCTest.class);

    public static void main(String[] args) {
        //将Java配置文件AppConfig传递给AnnotationConfigApplicationContext的构造方法，
        // 这样它就能够读取配置了。然后将配置里面的Bean装配到IoC容器中
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getId().toString());
    }
}
