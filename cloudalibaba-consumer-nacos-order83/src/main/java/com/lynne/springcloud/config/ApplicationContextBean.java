package com.lynne.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description //TODO
 * @Date 2023/3/19 8:47
 * @Author fengyongli
 **/
@Configuration
public class ApplicationContextBean {

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
