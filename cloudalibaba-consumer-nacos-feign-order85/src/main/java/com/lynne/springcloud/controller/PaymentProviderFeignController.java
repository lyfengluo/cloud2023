package com.lynne.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lynne.springcloud.entities.CommonResult;
import com.lynne.springcloud.entities.Payment;
import com.lynne.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/25 10:49
 * @Author fengyongli
 **/
@RestController
public class PaymentProviderFeignController {

    @Resource
    PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id")Long id){

        return paymentService.paymentSQL(id);
    }
}
