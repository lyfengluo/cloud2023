package com.lynne.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description //TODO
 * @Date 2023/3/9 5:38
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@Slf4j
public class HystrixOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOrder80.class,args);
    }
}
