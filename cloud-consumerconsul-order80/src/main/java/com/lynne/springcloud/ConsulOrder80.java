package com.lynne.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description //TODO
 * @Date 2023/3/5 0:19
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80.class,args);
    }
}
