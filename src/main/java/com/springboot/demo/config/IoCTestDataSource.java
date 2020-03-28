package com.springboot.demo.config;

import com.springboot.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author Wu Ming
 * @Date 2020/3/28 14:58
 * @Version 1.0
 */
public class IoCTestDataSource {
    private static Logger logger = LoggerFactory.getLogger(IoCTestDataSource.class);
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigDataSource.class);
        DataSource dataSource = ctx.getBean(DataSource.class);
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            String sql = "SELECT * FROM aaa";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("zxx"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            assert resultSet != null;
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
