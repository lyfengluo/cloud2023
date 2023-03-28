package com.lynne.springcloud.alibaba.controller;

import com.lynne.springcloud.alibaba.domain.Storage;
import com.lynne.springcloud.alibaba.service.StorageService;
import com.lynne.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description //TODO
 * @Date 2023/3/28 6:28
 * @Author fengyongli
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/storage/save")
    public CommonResult<Storage> save(Storage storage){
        int i = storageService.create(storage);
        return new CommonResult<>(200,"创建成功",storage);
    }

    @PostMapping("/storage/updateStorage")
    public CommonResult updateStorage(@RequestParam("count")Integer count,@RequestParam("productId")Long productId){
        int update = storageService.update(count, productId);
        if(update>0){
            return new CommonResult(200,"更新库存成功");
        }
        return new CommonResult(444,"更新库存失败");
    }
}
