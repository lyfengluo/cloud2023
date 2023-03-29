package com.lynne.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description //TODO
 * @Date 2023/3/28 5:19
 * @Author fengyongli
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//取消数据源自动创建的配置
@EnableDiscoveryClient
public class SeataStorageMain2002 {
    public static void main(String[] args) {

        SpringApplication.run(SeataStorageMain2002.class,args);
    }
}
