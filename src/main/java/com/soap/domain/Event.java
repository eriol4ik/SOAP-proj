package com.soap.domain;

import com.soap.adapter.DateAdapter;

import java.sql.Date;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "event",
        propOrder = {"id", "title", "description", "date", "users"}
)
@XmlRootElement(name = "event")
public class Event {
    @XmlElement(required = true)
    private Long id;

    @XmlElement(required = true)
    private String title;

    @XmlElement(required = true)
    private String description;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date date;

    @XmlElement
    private List<User> users;

    public Event() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}