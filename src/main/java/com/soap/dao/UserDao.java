package com.soap.dao;

import com.soap.domain.User;

public interface UserDao {
    User getById(Long id);
}
