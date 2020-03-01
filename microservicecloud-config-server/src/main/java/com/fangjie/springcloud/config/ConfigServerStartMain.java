package com.fangjie.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/3/1 14:53
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerStartMain {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStartMain.class,args);
    }
}
