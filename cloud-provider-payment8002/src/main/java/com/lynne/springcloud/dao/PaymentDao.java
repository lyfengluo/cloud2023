package com.lynne.springcloud.dao;

import com.lynne.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description //TODO
 * @Date 2023/2/26 8:06
 * @Author fengyongli
 **/
@Mapper     //推荐使用
//@Repository   //插入时可能会存在数据问题
public interface PaymentDao {

    public int save(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
