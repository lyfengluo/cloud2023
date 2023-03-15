package com.lynne.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description //TODO
 * @Date 2023/3/5 0:03
 * @Author fengyongli
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value="/payment/consul")
    public String paymentConsul(){

        return "springcloud with consul:"+serverPort+ "\t"+UUID.randomUUID().toString();
    }
}
