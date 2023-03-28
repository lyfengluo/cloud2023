package com.lynne.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description //TODO
 * @Date 2023/3/9 5:44
 * @Author fengyongli
 **/
@Component
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = OrderHystrixServiceImpl.class)
public interface OrderHystrixService {

    @GetMapping(value = "/payment/hystrix/paymentInfo_Ok/get/{id}")
    public String paymentInfo_Ok(@PathVariable("id")Integer id);


    @GetMapping(value = "/payment/hystrix/paymentInfo_timeOut/get/{id}")
    public String paymentInfo_timeOut(@PathVariable("id")Integer id);

    @GetMapping("/payment/zipkin")
    public String paymentZipkin();
}
