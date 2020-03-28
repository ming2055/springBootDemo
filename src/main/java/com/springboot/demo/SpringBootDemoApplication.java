package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

//SpringBootApplication相当于@configuration+@EnableAutoConfiguration+@CompoentScan
//提供的exclude和excludeName两个方法是对于其内部的自动配置类才会生效的。
// 为了能够排除其他类，还可以再加入@ComponentScan以达到我们的目的
@SpringBootApplication
@ComponentScan(basePackages="com.springboot.demo",
        excludeFilters = {@ComponentScan.Filter(type =FilterType.ANNOTATION, classes = {Service.class})})
@PropertySource(value={"classpath:jdbc.properties"}, ignoreResourceNotFound=true)
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
