package com.lynne.springcloud.service;

import com.lynne.springcloud.entities.CommonResult;
import com.lynne.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Description //TODO
 * @Date 2023/3/25 21:49
 * @Author fengyongli
 **/
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
