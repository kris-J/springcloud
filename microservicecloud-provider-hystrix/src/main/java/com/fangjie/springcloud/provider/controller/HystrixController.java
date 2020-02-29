package com.fangjie.springcloud.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author fangjie
 * @Description: 服务熔断
 * @date 2020/2/27 17:00
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {


    /**
     * 随机时间超时
     *
     * @return
     */
    @RequestMapping("/timeout")
    //熔断机制，超时后直接返回timeout_fallback方法
    @HystrixCommand(fallbackMethod = "timeout_fallback")
    public String timeout() {
        Random random = new Random(System.currentTimeMillis());
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout success";
    }

    public String timeout_fallback() {
        return "timeout hystrix fallback";
    }

    @RequestMapping("/exception")
    //熔断机制，超时后直接返回timeout_fallback方法
    @HystrixCommand(fallbackMethod = "exception_fallback")
    public String exception() {
        Random random = new Random(System.currentTimeMillis());
        int randomInt = random.nextInt(10);

        if (randomInt % 2 == 0) {
            throw new RuntimeException("current number is odd");
        }
        return "exception success";
    }

    public String exception_fallback() {
        return "exception hystrix fallback";
    }

}
