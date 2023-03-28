package com.lynne.springcloud.myhander;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lynne.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @Description //TODO
 * @Date 2023/3/25 7:35
 * @Author fengyongli
 **/
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
}
