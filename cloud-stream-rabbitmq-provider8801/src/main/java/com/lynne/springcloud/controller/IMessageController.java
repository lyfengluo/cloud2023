package com.lynne.springcloud.controller;

import com.lynne.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/18 8:51
 * @Author fengyongli
 **/
@RestController
public class IMessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
       return iMessageProvider.send();
    }
}
