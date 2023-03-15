package com.lynne.springcloud.service;

import com.lynne.springcloud.dao.PaymentDao;
import com.lynne.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/2/26 8:41
 * @Author fengyongli
 **/
@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    public int save(Payment payment){

        return paymentDao.save(payment);
    }

    public Payment getPaymentById(Long id){

        return paymentDao.getPaymentById(id);
    }
}
