package com.fangjie.springcloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/27 17:31
 */
//feign结合hystrix
@FeignClient(name = "microservice-provider-hystrix",fallbackFactory = HystrixFeignFallbackFactory.class)
public interface IHystrixFeignService {

    @RequestMapping("/hystrixdown/timeout")
    String timeout();

    @RequestMapping("/hystrixdown/exception")
    String exception();
}
