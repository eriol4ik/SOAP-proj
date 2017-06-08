package com.soap.server.service.impl;

import com.soap.server.dao.EventDao;
import com.soap.server.domain.Event;
import com.soap.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventServiceImpl implements EventService {
    @Autowired
    private EventDao eventDao;


    @Override
    public Event getById(Long id) {
        return eventDao.getById(id);
    }

    @Override
    public Long create(Event event) {
        return eventDao.create(event);
    }
}
