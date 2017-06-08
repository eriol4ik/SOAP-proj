package com.soap.server.webservice.user;

import org.springframework.beans.BeanUtils;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "createUserResponse", namespace = "http://soap.com/service")
public class CreateUserResponse {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
