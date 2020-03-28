package com.springboot.demo.config;

import com.springboot.demo.service.UserService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 11:39
 * @Version 1.0
 */

//@ComponentScan则是标明采用何种策略去扫描装配Bean。这里加入了@ComponentScan，意味着它会进行扫描，
// 但是它只会扫描类AppConfig所在的当前包和其子包.所以将POJO UserForScanLoad放在了相同的包
@Configuration
@ComponentScan(basePackages = "com.springboot.demo",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Service.class})},
        lazyInit = false)
public class AppConfigForScanLoad {
}
