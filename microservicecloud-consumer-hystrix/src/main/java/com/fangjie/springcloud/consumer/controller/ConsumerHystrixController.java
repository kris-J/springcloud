package com.fangjie.springcloud.consumer.controller;

import com.fangjie.springcloud.consumer.service.IHystrixFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/27 17:30
 */
@RestController
@RequestMapping("/consumer/hystrix")
public class ConsumerHystrixController {

    @Autowired
    private IHystrixFeignService hystrixFeignService;

    @RequestMapping("/timeout")
    public String timeout(){
        return hystrixFeignService.timeout();
    }

    @RequestMapping("/exception")
    public String exception(){
        return hystrixFeignService.exception();
    }
}
