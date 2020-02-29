package com.fangjie.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/29 15:48
 */
@SpringBootApplication
//启动zuul
@EnableZuulProxy
public class ZuulStartMain {

    public static void main(String[] args) {
        SpringApplication.run(ZuulStartMain.class, args);
    }
}
