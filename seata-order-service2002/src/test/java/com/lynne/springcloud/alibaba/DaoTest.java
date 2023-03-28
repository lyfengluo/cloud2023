package com.lynne.springcloud.alibaba;

import com.lynne.springcloud.alibaba.dao.StorageDao;
import com.lynne.springcloud.alibaba.domain.Storage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/28 5:36
 * @Author fengyongli
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class DaoTest {

    @Resource
    private StorageDao storageDao;

    @Test
    public void insertTest(){
        Storage storage = new Storage();
        storage.setProductId(2L);
        storage.setTotal(200);
        storage.setUsed(0);
        storage.setResidue(200);
        storageDao.create(storage);
    }

    @Test
    public void updateTest(){
        storageDao.update(10,2L);
    }
}
