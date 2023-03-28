package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.domain.Storage;

/**
 * @Description //TODO
 * @Date 2023/3/28 6:25
 * @Author fengyongli
 **/
public interface StorageService {

    int create(Storage storage);

    int update(Integer count,Long productId);
}
