package com.soap.server.endpoint;

import com.soap.server.service.UserService;
import com.soap.server.webservice.user.CreateUserRequest;
import com.soap.server.webservice.user.CreateUserResponse;
import com.soap.server.webservice.user.GetByIdUserRequest;
import com.soap.server.webservice.user.GetByIdUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    private static final String NAMESPACE_URI = "http://soap.com/service";

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getByIdUserRequest")
    @ResponsePayload
    public GetByIdUserResponse getById(@RequestPayload GetByIdUserRequest request) {
        GetByIdUserResponse response = new GetByIdUserResponse();
        response.setUser(userService.getById(request.getId()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUserRequest")
    @ResponsePayload
    public CreateUserResponse createUser(@RequestPayload CreateUserRequest request) {
        CreateUserResponse response = new CreateUserResponse();
        response.setId(userService.create(request.getUser()));

        return response;
    }
}
