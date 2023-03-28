package com.lynne.springcloud.alibaba.dao;

import com.lynne.springcloud.alibaba.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

@Mapper
public interface AccountDao {

    public int create(Account account);

    int update(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
