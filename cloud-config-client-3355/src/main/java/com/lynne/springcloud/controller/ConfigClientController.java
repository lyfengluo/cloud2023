package com.lynne.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description //TODO
 * @Date 2023/3/16 5:56
 * @Author fengyongli
 **/
@RestController
@RefreshScope
public class ConfigClientController {


    //配置文件中信息config:
     //info: master branch,springcloud-config/config-dev.yml version=1
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
