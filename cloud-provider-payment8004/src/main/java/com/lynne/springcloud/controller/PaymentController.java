package com.lynne.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description //TODO
 * @Date 2023/3/3 21:49
 * @Author fengyongli
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    @GetMapping(value="/payment/zk")
    public String paymentzk(){

        return "springcloud with zookeeper"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
