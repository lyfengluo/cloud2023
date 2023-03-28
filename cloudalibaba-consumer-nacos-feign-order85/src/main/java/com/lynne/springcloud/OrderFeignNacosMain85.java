package com.lynne.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description //TODO
 * @Date 2023/3/25 21:46
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderFeignNacosMain85 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignNacosMain85.class,args);
    }
}
