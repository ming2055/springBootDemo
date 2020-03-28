package com.springboot.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 0:43
 * @Version 1.0
 */

@ConfigurationProperties("database")
@Component("dataBaseProperties")
public class DataBaseProperties {
    //@Value注解，使用${......}这样的占位符读取配置在属性文件的内容。
    // 这里的@Value注解，既可以加载属性，也可以加在方法上,加在方法上会打印出来
//    @Value("${database.driverName}")
    private String driverName = null;


    private String url = null;

    private String username = null;
    private String password = null;

    public void setDriverName(String driverName) {
        System.out.println(driverName);
        System.out.println(driverName);
        this.driverName = driverName;
    }
//    @Value("${database.url}")
    public void setUrl(String url) {
        System.out.println(url);
        this.url = url;
    }

//    @Value("${database.username}")
    public void setUsername(String username) {
        System.out.println(username);
        this.username = username;
    }

//    @Value("${database.password}")
    public void setPassword(String password) {
        System.out.println(password);
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
