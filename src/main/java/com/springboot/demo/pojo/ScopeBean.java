package com.springboot.demo.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 11:14
 * @Version 1.0
 * 作用域
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopeBean {
}
