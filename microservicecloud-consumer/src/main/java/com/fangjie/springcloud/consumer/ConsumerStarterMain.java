package com.fangjie.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:41
 */
@SpringBootApplication
//自定义ribbon负载均衡算法
//@RibbonClient(name = "microservice-provider",configuration = com.fangjie.springcloud.consumer.ribbonRule.ConsumerRibbonRule.class)
public class ConsumerStarterMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStarterMain.class, args);
    }
}
