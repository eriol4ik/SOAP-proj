package com.soap.service.event;

import com.soap.domain.Event;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "createEventRequest", namespace = "http://soap.com/service")
public class CreateEventRequest {
    @XmlElement(required = true)
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
