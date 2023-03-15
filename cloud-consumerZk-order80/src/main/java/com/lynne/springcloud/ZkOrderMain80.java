package com.lynne.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description //TODO
 * @Date 2023/3/4 6:45
 * @Author fengyongli
 **/
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class ZkOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ZkOrderMain80.class,args);
    }
}
