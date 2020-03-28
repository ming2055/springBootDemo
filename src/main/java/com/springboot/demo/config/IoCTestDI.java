package com.springboot.demo.config;

import com.springboot.demo.pojo.BusinessPerson;
import com.springboot.demo.pojo.Dog;
import com.springboot.demo.pojo.definition.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 18:34
 * @Version 1.0
 */


public class IoCTestDI {
    private static Logger log = LoggerFactory.getLogger(IoCTestForScanLoad.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigForScanLoad.class);
        Person businessPerson = ctx.getBean(BusinessPerson.class);
        businessPerson.service();

    }
}
