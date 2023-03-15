package com.lynne.springcloud.controller;

import com.lynne.springcloud.service.HystrixPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/8 6:30
 * @Author fengyongli
 **/
@RestController
@Slf4j
public class HystrixPaymentController {

    @Resource
    private HystrixPaymentService paymentService;

    @GetMapping(value = "payment/hystrix/paymentInfo_Ok/get/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id){

        String result = paymentService.paymentInfo_Ok(id);
        log.info("*****************"+result);
        return result;
    }
    @GetMapping(value = "payment/hystrix/paymentInfo_timeOut/get/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id){

        String result = paymentService.paymentInfo_timeOut(id);
        log.info("*****************"+result);
        return result;
    }

    @GetMapping(value="/payment/hystrix/paymentCircuitBreaker/get/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){

        return paymentService.paymentCircuitBreaker(id);
    }
}
