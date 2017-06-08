package com.soap.server.service.impl;

import com.soap.server.dao.UserDao;
import com.soap.server.domain.User;
import com.soap.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }

    @Override
    public Long create(User user) {
        return userDao.create(user);
    }
}
