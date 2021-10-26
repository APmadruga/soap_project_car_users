package com.soap.bootcamp2.controller;

import com.soap.bootcamp2.model.GetUserRequest;
import com.soap.bootcamp2.model.GetUserResponse;
import com.soap.bootcamp2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserController {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
