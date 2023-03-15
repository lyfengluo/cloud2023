package com.lynne.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/5 0:22
 * @Author fengyongli
 **/
@RestController
public class ConsulOrderController {

    @Resource
    private RestTemplate restTemplate;
    public static final String INVOME_URL = "http://consul-provider-payment";

    @GetMapping(value="/consumer/payment/consul")
    public String payment(){

        return restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
    }

}
