package com.lynne.springcloud.alibaba.controller;

import com.lynne.springcloud.alibaba.domain.Account;
import com.lynne.springcloud.alibaba.service.AccountService;
import com.lynne.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:23
 * @Author fengyongli
 **/

@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/account/save")
    public CommonResult save(Account account){
        accountService.create(account);
        return new CommonResult(200,"c创建成功",account);
    }

    @PostMapping("/account/update")
    public CommonResult updateAccount(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money){
        int update = accountService.update(userId, money);
        if(update>0){
           return new CommonResult(200,"更新成功");
        }
        return new CommonResult(444,"更新失败");
    }
}
