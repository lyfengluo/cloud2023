package com.lynne.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/4 6:49
 * @Author fengyongli
 **/
@RestController
public class ZkOrderController {

    public static final String CONSUMER_URL = "http://provider-service-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value="/consumer/payment/zk")
    public String payment(){

        return restTemplate.getForObject(CONSUMER_URL+"/payment/zk",String.class);
    }
}
