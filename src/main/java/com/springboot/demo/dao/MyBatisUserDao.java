package com.springboot.demo.dao;

import com.springboot.demo.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * @Author Wu Ming
 * @Date 2020/4/2 20:57
 * @Version 1.0
 */
@Repository
public interface MyBatisUserDao {
    public User getUser(Long id);
}
