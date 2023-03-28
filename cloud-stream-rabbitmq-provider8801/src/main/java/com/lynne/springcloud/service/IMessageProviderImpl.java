package com.lynne.springcloud.service;

import cn.hutool.core.lang.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/18 8:46
 * @Author fengyongli
 **/
@EnableBinding(Source.class)//定义消息的推送管道
@Slf4j
@Component
public class IMessageProviderImpl implements IMessageProvider{

    @Resource
    private MessageChannel output;
    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("*****serial: "+serial);
        return null;
    }
}
