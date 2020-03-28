package com.springboot.demo.config;

import com.springboot.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 10:38
 * @Version 1.0
 */

//@Configuration代表这是一个Java配置文件，Spring的容器会根据它来生成IoC容器去装配Bean
@Configuration
public class AppConfig {

    //@Bean代表将initUser方法返回的POJO装配到IoC容器中，而其属性name定义这个Bean的名称，
    // 如果没有配置它，则将方法名称“initUser”作为Bean的名称保存到Spring IoC容器中。
    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(10L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }
}
