package com.soap.server.dao;

import com.soap.server.domain.User;

public interface UserDao {
    User getById(Long id);

    Long create(User user);
}
