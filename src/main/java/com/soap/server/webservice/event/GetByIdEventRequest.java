package com.soap.server.webservice.event;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getByIdEventRequest", namespace = "http://soap.com/service")
public class GetByIdEventRequest {
    @XmlElement(required = true)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
