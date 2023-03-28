package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.domain.Account;

import java.math.BigDecimal;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:20
 * @Author fengyongli
 **/
public interface AccountService {

    public int create(Account account);

    int update(Long userId, BigDecimal money);
}
