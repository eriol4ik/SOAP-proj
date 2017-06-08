package com.soap.server.webservice.user;

import com.soap.server.domain.User;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getByIdUserResponse", namespace = "http://soap.com/service")
public class GetByIdUserResponse {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
