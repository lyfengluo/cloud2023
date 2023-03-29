package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.dao.OrderDao;
import com.lynne.springcloud.alibaba.domain.Order;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/27 19:18
 * @Author fengyongli
 **/
@Service
@Slf4j
public class OrderServiceImpl implements OrderService{
    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private  AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {

        log.info("----->开始新建订单");

        orderDao.create(order);
        //扣减库存
        log.info("----->订单微服务开始调用库存，做扣减Count");
        storageService.update(order.getProductId(),order.getCount());
        log.info("----->订单微服务开始调用库存，做扣减end");
        //扣减账户
        log.info("----->订单微服务开始调用账户，做扣减Money");
        accountService.update(order.getUserId(),order.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减end");

        //修改订单状态，从零到1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");

        log.info("----->下订单结束了");
    }
}
