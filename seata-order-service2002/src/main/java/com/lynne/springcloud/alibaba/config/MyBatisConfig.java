package com.lynne.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description //TODO
 * @Date 2023/3/27 20:34
 * @Author fengyongli
 **/
@Configuration
@MapperScan({"com.lynne.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
