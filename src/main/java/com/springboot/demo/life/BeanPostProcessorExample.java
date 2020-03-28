package com.springboot.demo.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 22:25
 * @Version 1.0
 */

//后置Bean初始化器
@Component
public class BeanPostProcessorExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor调用"
                + "postProcessBeforeInitialization方法，参数【"
                + bean.getClass().getSimpleName() + "】【" + beanName + "】 ");
        return bean;
    }
}
