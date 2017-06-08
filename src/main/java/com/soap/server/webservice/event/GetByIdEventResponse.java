package com.soap.server.webservice.event;

import com.soap.server.domain.Event;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "getByIdEventResponse", namespace = "http://soap.com/service")
public class GetByIdEventResponse {
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
