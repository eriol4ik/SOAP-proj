package com.soap.server.endpoint;

import com.soap.server.dao.EventDao;
import com.soap.server.service.EventService;
import com.soap.server.webservice.event.CreateEventRequest;
import com.soap.server.webservice.event.CreateEventResponse;
import com.soap.server.webservice.event.GetByIdEventResponse;
import com.soap.server.webservice.event.GetByIdEventRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EventEndpoint {
    private static final String NAMESPACE_URI = "http://soap.com/service";

    @Autowired
    private EventService eventService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getByIdEventRequest")
    @ResponsePayload
    public GetByIdEventResponse getById(@RequestPayload GetByIdEventRequest request) {
        GetByIdEventResponse response = new GetByIdEventResponse();
        response.setEvent(eventService.getById(request.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEventRequest")
    @ResponsePayload
    public CreateEventResponse create(@RequestPayload CreateEventRequest request) {
        CreateEventResponse response = new CreateEventResponse();
        response.setId(eventService.create(request.getEvent()));

        return response;
    }

}
