package com.lynne.springcloud.controller;

import com.lynne.springcloud.service.OrderHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/9 5:51
 * @Author fengyongli
 **/
@RestController
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private OrderHystrixService orderHystrixService;

    @HystrixCommand(fallbackMethod = "paymentInfo_timeOutFallBackMethod",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    @GetMapping(value = "/consumer/hystrix/paymentInfo_timeOut/get/{id}")
    public String paymentInfo_timeOut(@PathVariable("id") Integer id){
        return orderHystrixService.paymentInfo_timeOut(id);
    }
    @GetMapping(value = "/consumer/hystrix/paymentInfo_Ok/get/{id}")
    @HystrixCommand
    public String paymentInfo_Ok(@PathVariable("id") Integer id){
        int i = 10/0;
        return orderHystrixService.paymentInfo_Ok(id);
    }

    public String paymentInfo_timeOutFallBackMethod(@PathVariable("id") Integer id){
        return "消费端85"+Thread.currentThread().getName()+"fallbackMethod";
    }

    //下面是全局fallback方法
    public String payment_Global_FallbackMethod(){
        return "Global异常处理信息，请稍后再试,(┬＿┬)";
    }
}
