package com.springboot.demo.config;

import com.springboot.demo.pojo.ScopeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 11:16
 * @Version 1.0
 */
public class IoCTestScopeBean {
    private static Logger logger = LoggerFactory.getLogger(IoCTestScopeBean.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfigForScanLoad.class);
        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
        logger.info("作用域测试结果");
        System.out.println(scopeBean1 == scopeBean2);
    }
}
