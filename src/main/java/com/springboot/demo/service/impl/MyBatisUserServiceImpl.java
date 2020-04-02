package com.springboot.demo.service.impl;

import com.springboot.demo.dao.MyBatisUserDao;
import com.springboot.demo.pojo.User;
import com.springboot.demo.service.MyBatisUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Wu Ming
 * @Date 2020/4/2 21:15
 * @Version 1.0
 */
@Service
public class MyBatisUserServiceImpl implements MyBatisUserService {
    @Autowired
    private MyBatisUserDao myBatisUserDao = null;

    @Override
    public User getUser(Long id) {
        return myBatisUserDao.getUser(id);
    }
}
