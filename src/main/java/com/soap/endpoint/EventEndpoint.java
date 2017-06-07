package com.soap.endpoint;

import com.soap.dao.EventDao;
import com.soap.service.event.CreateEventRequest;
import com.soap.service.event.CreateEventResponse;
import com.soap.service.event.GetByIdEventResponse;
import com.soap.service.event.GetByIdEventRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EventEndpoint {
    private static final String NAMESPACE_URI = "http://soap.com/service";

    @Autowired
    private EventDao eventDao;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getByIdEventRequest")
    @ResponsePayload
    public GetByIdEventResponse getById(@RequestPayload GetByIdEventRequest request) {
        GetByIdEventResponse response = new GetByIdEventResponse();
        response.setEvent(eventDao.getById(request.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEventRequest")
    @ResponsePayload
    public CreateEventResponse create(@RequestPayload CreateEventRequest request) {
        CreateEventResponse response = new CreateEventResponse();
        response.setId(eventDao.create(request.getEvent()));

        return response;
    }

}
