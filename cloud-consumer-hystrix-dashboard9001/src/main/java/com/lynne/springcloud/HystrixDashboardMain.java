package com.lynne.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description //TODO
 * @Date 2023/3/11 17:37
 * @Author fengyongli
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain.class,args);
    }

}
