package com.lynne.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description //TODO
 * @Date 2023/3/8 6:22
 * @Author fengyongli
 **/
@Service
public class HystrixPaymentService {

    public String paymentInfo_Ok(Integer id){

        return "线程池:"+Thread.currentThread().getName()+"paymentInfo_Ok:id:"+id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_timeOutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_timeOut(Integer id){
        int timeOuter = 8;
        try {
            TimeUnit.SECONDS.sleep(timeOuter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ThreadPool:"+Thread.currentThread().getName()+"paymentInfo_timeOut:id:"+id;
    }

    public String paymentInfo_timeOutHandler(Integer id){
        return "ThreadPool:"+Thread.currentThread().getName()+"paymentInfo_timeOutHandler:id:"+id;

    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreakerFallBack",commandProperties = {
           @HystrixProperty(name = "circuitBreaker.enabled",value="true"),//是否开启熔断器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),//请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),//时间范围
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="60")//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id){
        if(id < 0){
           throw  new RuntimeException("******id不能为负数");
        }
        return Thread.currentThread().getName()+"调用成功！流水号是："+IdUtil.simpleUUID();
    }

    public String paymentCircuitBreakerFallBack(Integer id){

        return "id不能为负数，请稍后再试";
    }
}
