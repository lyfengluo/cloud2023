package com.lynne.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description //TODO
 * @Date 2023/2/26 14:54
 * @Author fengyongli
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced
   public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
