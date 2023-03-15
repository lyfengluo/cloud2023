package com.lynne.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @Description //TODO
 * @Date 2023/3/8 6:20
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableCircuitBreaker
public class HystrixPaymentMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentMain.class,args);
    }
}
