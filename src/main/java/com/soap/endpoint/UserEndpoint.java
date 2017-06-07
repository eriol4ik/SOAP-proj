package com.soap.endpoint;

import com.soap.dao.UserDao;
import com.soap.service.user.GetByIdUserRequest;
import com.soap.service.user.GetByIdUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    private static final String NAMESPACE_URI = "http://soap.com/service";

    @Autowired
    private UserDao userDao;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getByIdUserRequest")
    @ResponsePayload
    public GetByIdUserResponse getById(@RequestPayload GetByIdUserRequest request) {
        GetByIdUserResponse response = new GetByIdUserResponse();
        response.setUser(userDao.getById(request.getId()));

        return response;
    }
}
