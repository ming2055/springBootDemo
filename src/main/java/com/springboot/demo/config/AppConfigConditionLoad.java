package com.springboot.demo.config;

import com.springboot.demo.condition.DatabaseConditional;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @Author Wu Ming
 * @Date 2020/3/29 10:34
 * @Version 1.0
 * 条件装配配置
 */

@Configuration
public class AppConfigConditionLoad {
//    @Bean(name = "dataSourceConditional", destroyMethod = "close")
//    @Conditional(DatabaseConditional.class)
    public DataSource getDataSource(
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
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
