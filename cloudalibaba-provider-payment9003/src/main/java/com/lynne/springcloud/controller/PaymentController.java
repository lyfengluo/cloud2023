package com.lynne.springcloud.controller;

import cn.hutool.core.lang.UUID;
import com.lynne.springcloud.entities.CommonResult;
import com.lynne.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Description //TODO
 * @Date 2023/3/25 10:25
 * @Author fengyongli
 **/
@RestController
public class PaymentController {

    @Value("${server.port}")
    String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L,new Payment(1L, UUID.randomUUID().toString()));
        hashMap.put(2L,new Payment(2L, UUID.randomUUID().toString()));
        hashMap.put(3L,new Payment(3L, UUID.randomUUID().toString()));
        hashMap.put(4L,new Payment(4L, UUID.randomUUID().toString()));
    }
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
    }

}
