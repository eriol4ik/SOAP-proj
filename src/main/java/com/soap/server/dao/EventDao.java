package com.soap.server.dao;

import com.soap.server.domain.Event;

public interface EventDao {
    Event getById(Long id);

    Long create(Event event);
}
