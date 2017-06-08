package com.soap.server.service;

import com.soap.server.domain.User;

public interface UserService {
    User getById(Long id);

    Long create(User user);
}
