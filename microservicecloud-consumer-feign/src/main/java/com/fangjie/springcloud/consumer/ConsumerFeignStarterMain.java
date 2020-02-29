package com.fangjie.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:41
 */
@SpringBootApplication
//自定义ribbon负载均衡算法
//@RibbonClient(name = "microservice-provider",configuration = com.fangjie.springcloud.consumer.ribbonRule.ConsumerRibbonRule.class)

//Fegin启动
@EnableFeignClients
public class ConsumerFeignStarterMain {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignStarterMain.class, args);
    }
}
