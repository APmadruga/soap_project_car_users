package com.soap.bootcamp2.controller;
import com.soap.bootcamp2.model.CarRequest;
import com.soap.bootcamp2.model.CarResponse;
import com.soap.bootcamp2.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarController {

    @Autowired
    private CarService carService;

    @PayloadRoot(namespace = "http://bootcamp.com/",
            localPart = "carRequest")
    @ResponsePayload
    public CarResponse carRequest(@RequestPayload CarRequest request) {
        CarResponse response = new CarResponse();
        response.setCar(carService.getCars(request.getBrand()));
        return response;
    }
}
