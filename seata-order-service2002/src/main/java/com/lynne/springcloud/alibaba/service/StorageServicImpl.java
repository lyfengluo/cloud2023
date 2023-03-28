package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.dao.StorageDao;
import com.lynne.springcloud.alibaba.domain.Storage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/28 6:26
 * @Author fengyongli
 **/
@Service
public class StorageServicImpl implements StorageService{

    @Resource
    private StorageDao storageDao;
    @Override
    public int create(Storage storage) {
        return storageDao.create(storage);
    }

    @Override
    public int update(Integer count, Long productId) {
        return storageDao.update(count,productId);
    }
}
