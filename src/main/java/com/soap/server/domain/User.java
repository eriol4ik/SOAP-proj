package com.soap.server.domain;


import org.springframework.beans.BeanUtils;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "user",
        propOrder = {"id", "username", "events"},
        namespace = "http://soap.com/service"
)
public class User {
    @XmlElement(required = true)
    private Long id;

    @XmlElement(required = true)
    private String username;

    private List<Event> events;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
