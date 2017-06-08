package com.soap.server.service;

import com.soap.server.domain.Event;

public interface EventService {
    Event getById(Long id);

    Long create(Event event);
}
