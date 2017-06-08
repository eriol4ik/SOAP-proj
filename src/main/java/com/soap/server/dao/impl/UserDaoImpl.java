package com.soap.server.dao.impl;

import com.soap.server.dao.UserDao;
import com.soap.server.domain.Event;
import com.soap.server.domain.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserDaoImpl implements UserDao {
    Map<Long, User> users = new HashMap<>();

    @PostConstruct
    public void initData() {
        User user = new User();
        user.setId(1L);
        user.setUsername("user1");
        user.setEvents(new ArrayList<Event>());

        Event event = new Event();
        event.setId(3L);
        event.setDescription("Third event description");
        event.setDate(Date.valueOf("2017-03-03"));
        user.getEvents().add(event);

        event = new Event();
        event.setId(4L);
        event.setDescription("Fourth event description");
        event.setDate(Date.valueOf("2017-04-04"));
        user.getEvents().add(event);

        users.put(user.getId(), user);

        user = new User();
        user.setId(2L);
        user.setUsername("user2");
        user.setEvents(new ArrayList<Event>());
        user.getEvents().add(users.get(1L).getEvents().get(1));

        event = new Event();
        event.setId(5L);
        event.setDescription("Fifth event description");
        event.setDate(Date.valueOf("2017-05-05"));
        user.getEvents().add(event);

        users.put(user.getId(), user);
    }

    @Override
    public User getById(Long id) {
        return users.get(id);
    }

    @Override
    public Long create(User user) {
        users.put(user.getId(), user);

        return user.getId();
    }
}
