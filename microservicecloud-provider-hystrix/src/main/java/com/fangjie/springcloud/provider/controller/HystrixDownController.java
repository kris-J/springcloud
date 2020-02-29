package com.fangjie.springcloud.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @author fangjie
 * @Description: 服务降级
 * @date 2020/2/27 17:00
 */
@RestController
@RequestMapping("/hystrixdown")
public class HystrixDownController {


    /**
     * 随机时间超时
     *
     * @return
     */
    @RequestMapping("/timeout")
    public String timeout() {
        Random random = new Random(System.currentTimeMillis());
        try {
            TimeUnit.SECONDS.sleep(random.nextInt(3));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "timeout success";
    }


    @RequestMapping("/exception")
    public String exception() {
        Random random = new Random(System.currentTimeMillis());
        int randomInt = random.nextInt(10);

        if (randomInt % 2 == 0) {
            throw new RuntimeException("current number is odd");
        }
        return "exception success";
    }

}
