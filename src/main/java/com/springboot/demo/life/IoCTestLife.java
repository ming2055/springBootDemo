package com.springboot.demo.life;

import com.springboot.demo.config.AppConfigForScanLoad;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 22:29
 * @Version 1.0
 */
public class IoCTestLife {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfigForScanLoad.class);
// 关闭IoC容器
        ctx.close();
    }
}
