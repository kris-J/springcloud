package com.fangjie.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:41
 */
@SpringBootApplication
//标注为eureka-client
@EnableEurekaClient
//服务发现
@EnableDiscoveryClient
//熔断器开启
@EnableCircuitBreaker
public class ProviderHystrixStarterMain {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixStarterMain.class, args);
    }
}
