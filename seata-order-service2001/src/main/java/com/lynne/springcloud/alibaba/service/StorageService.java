package com.lynne.springcloud.alibaba.service;

import com.lynne.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description //TODO
 * @Date 2023/3/27 19:20
 * @Author fengyongli
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/updateStorage")
     CommonResult update(@RequestParam("productId")Long productId,@RequestParam("count")Integer count);
}
