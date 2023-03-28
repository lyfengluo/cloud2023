package com.lynne.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description //TODO
 * @Date 2023/3/11 8:12
 * @Author fengyongli
 **/
@Component
public class OrderHystrixServiceImpl implements OrderHystrixService{

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "走了实现的方法了paymentInfo_Ok";
    }

    @Override
    public String paymentInfo_timeOut(Integer id) {
        return "走了实现的方法了，paymentInfo_timeOut";
    }

    @Override
    public String paymentZipkin() {
        return null;
    }
}
