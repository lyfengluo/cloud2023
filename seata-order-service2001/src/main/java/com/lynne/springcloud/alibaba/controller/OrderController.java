package com.lynne.springcloud.alibaba.controller;

import com.lynne.springcloud.alibaba.domain.CommonResult;
import com.lynne.springcloud.alibaba.domain.Order;
import com.lynne.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/27 20:28
 * @Author fengyongli
 **/

@RestController
public class OrderController {

    @Resource
    OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功！");
    }

}
