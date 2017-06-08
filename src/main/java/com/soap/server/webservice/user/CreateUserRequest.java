package com.soap.server.webservice.user;

import com.soap.server.domain.User;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "createUserRequest", namespace = "http://soap.com/service")
public class CreateUserRequest {
    @XmlElement(required = true)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
