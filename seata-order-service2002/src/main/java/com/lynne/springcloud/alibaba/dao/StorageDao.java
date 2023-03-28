package com.lynne.springcloud.alibaba.dao;

import com.lynne.springcloud.alibaba.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {

    public int create(Storage storage);

    public int update(@Param("count") Integer count, @Param("productId") Long productId);
}
