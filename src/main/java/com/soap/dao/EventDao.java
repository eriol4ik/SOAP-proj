package com.soap.dao;

import com.soap.domain.Event;

public interface EventDao {
    Event getById(Long id);

    Long create(Event event);
}
