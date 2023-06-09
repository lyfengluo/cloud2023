package com.lynne.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:04
 * @Author fengyongli
 **/

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置

@EnableDiscoveryClient
public class SeataAccountMain2003 {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMain2003.class,args);
    }
}
