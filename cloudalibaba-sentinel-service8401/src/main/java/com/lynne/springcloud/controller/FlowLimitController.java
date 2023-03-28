package com.lynne.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.sun.deploy.security.BlockedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Description //TODO
 * @Date 2023/3/23 19:43
 * @Author fengyongli
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {

        return "------testB";
    }

    @GetMapping("/testD")
    public String testD()
    {
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");

        return "------testD";
    }
    @GetMapping("/testC")
    public String testC()
    {

        log.info("testC 测试异常比例");
        int age = 10/0;
        return "------testC";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常数");
        int age = 10/0;
        return "------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
//    public String testHotKey(@PathVariable(value = "p1",required = false) String p1,@PathVariable(value = "p2",required = false)String p2){
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1, @RequestParam(value = "p2",required = false)String p2){
        int age = 10/0;
        return "------testHotKey";
    }

    public  String deal_testHotKey(String p1, String p2, BlockException exception){
        log.info(p1+"************************************");
        exception.fillInStackTrace();
        return "------deal_testHotKey,o(╥﹏╥)o";

    }

}
