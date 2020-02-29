package com.fangjie.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 15:03
 */
@SpringBootApplication
//标注为eureka-server
@EnableEurekaServer
public class EurekaStartMain {

    public static void main(String[] args) {
        SpringApplication.run(EurekaStartMain.class, args);
    }
}
