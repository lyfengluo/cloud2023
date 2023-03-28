package com.lynne.springcloud.alibaba;

import com.lynne.springcloud.alibaba.dao.AccountDao;
import com.lynne.springcloud.alibaba.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:14
 * @Author fengyongli
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {

    @Resource
    private AccountDao accountDao;

    @Test
    public void insertTest(){
        Account account = new Account();
        account.setUserId(2L);
        account.setTotal(new BigDecimal(1000));
        account.setUsed(new BigDecimal(0));
        account.setResidue(new BigDecimal(1000));
        accountDao.create(account);
    }

    @Test
    public void update(){
        accountDao.update(2L,new BigDecimal(50));
    }
}
