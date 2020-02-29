package com.fangjie.springcloud.consumer.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author fangjie
 * @Description: 服务降级处理factory，实现了
 * @date 2020/2/27 17:36
 */
@Component
public class HystrixFeignFallbackFactory implements FallbackFactory<IHystrixFeignService> {
    @Override
    public IHystrixFeignService create(Throwable throwable) {
        System.out.println(throwable.toString());
        return new IHystrixFeignService() {
            @Override
            public String timeout() {
                return "hystrix down timeout";
            }

            @Override
            public String exception() {
                return "hystrix down exception";
            }
        };
    }
}
