package com.lynne.springcloud.controller;

import com.lynne.springcloud.entities.CommonResult;
import com.lynne.springcloud.entities.Payment;
import com.lynne.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description //TODO
 * @Date 2023/2/26 8:44
 * @Author fengyongli
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value="/payment/save")
    public CommonResult save(@RequestBody Payment payment){
        int result = paymentService.save(payment);
        if(result>0){
            log.info("插入成功！"+result);
            return  new CommonResult(200,"保存成功！端口是"+serverPort,result);
        }else {
            return new CommonResult(444,"保存失败");
        }
    }

    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){

        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            log.info("查询成功！"+payment);
            return  new CommonResult(200,"查询成功！端口是"+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败！无ID为："+id+"的支付信息");
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){

        List<String> services = discoveryClient.getServices();
        services.forEach(a->{
            log.info("service:"+a);
        });

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        instances.forEach(a->{
            log.info(a.getHost()+a.getPort());
        });
        return  instances;
    }

    @GetMapping(value = "/payment/getLB")
    public String getPaymentLB(){
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeOut")
    public String paymentFeignTimeOut(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
