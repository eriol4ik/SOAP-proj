package com.soap.dao.impl;

import com.soap.dao.EventDao;
import com.soap.domain.Event;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class EventDaoImpl implements EventDao {
    private Map<Long, Event> events = new HashMap<>();

    @PostConstruct
    public void initData() {
        Event event = new Event();
        event.setId(1L);
        event.setTitle("First event");
        event.setDescription("First event description");
        event.setDate(java.sql.Date.valueOf("2017-01-01"));
        events.put(event.getId(), event);

        event = new Event();
        event.setId(2L);
        event.setTitle("Second event");
        event.setDescription("Second event description");
        event.setDate(java.sql.Date.valueOf("2017-02-02"));
        events.put(event.getId(), event);
    }

    @Override
    public Event getById(Long id) {
        return events.get(id);
    }

    @Override
    public Long create(Event event) {
        events.put(event.getId(), event);
        return event.getId();
    }
}
