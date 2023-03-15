package com.lynne.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description //TODO
 * @Date 2023/3/7 5:23
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignOrderMain80.class,args);
    }
}

