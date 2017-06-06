package com.soap.domain;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "user",
        propOrder = {"id", "username", "password", "events"}
)
@XmlRootElement(name = "user")
public class User {
    @XmlElement(required = true)
    private Long id;

    @XmlElement(required = true)
    private String username;

    @XmlElement(required = true)
    private String password;

    @XmlElement
    private List<Event> events;

    public User() {
    }

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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
