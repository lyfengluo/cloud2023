package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.dao.AccountDao;
import com.lynne.springcloud.alibaba.domain.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:21
 * @Author fengyongli
 **/
@Service
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountDao accountDao;
    @Override
    public int create(Account account) {
        return accountDao.create(account);
    }

    @Override
    public int update(Long userId, BigDecimal money) {
        return accountDao.update(userId,money);
    }
}
