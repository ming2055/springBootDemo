package com.springboot.demo.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 12:44
 * @Version 1.0
 *
 * 使用@Profile配置生产测试数据源
 */

@Configuration
public class AppConfigProfile {
//    @Bean(name = "dataSourceProfile", destroyMethod = "close")
//    @Profile("prod")
    public DataSource getProdDataSource(
            @Value("${database.driverName}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password) {
        Properties props = new Properties();
        props.setProperty("driver", driver);
        props.setProperty("url", url);
        props.setProperty("username", username);
        props.setProperty("password", password);
        DataSource dataSource = null;
        try {
            System.out.println("==============这是生产库");
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }


//    @Bean(name = "dataSourceProfile", destroyMethod = "close")
//    @Profile("test")
    public DataSource getTestDataSource(
            @Value("${database.driverName}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password) {
        Properties props = new Properties();
        props.setProperty("driver", driver);
        props.setProperty("url", url);
        props.setProperty("username", username);
        props.setProperty("password", password);
        DataSource dataSource = null;
        try {
            System.out.println("=====================这是测试库");
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
