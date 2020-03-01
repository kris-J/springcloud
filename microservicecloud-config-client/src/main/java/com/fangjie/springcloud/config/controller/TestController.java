package com.fangjie.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangjie
 * @Description: ${todo}
 * date 2020/3/1 16:12
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${hello}")
    private String hello;

    @RequestMapping("config")
    public String getConfig(){
        System.out.println(port + ":" + applicationName + ":"+hello);
        return port + ":" + applicationName + ":"+hello;
    }
}
