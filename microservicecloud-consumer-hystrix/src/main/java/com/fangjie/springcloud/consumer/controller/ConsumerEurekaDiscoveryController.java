package com.fangjie.springcloud.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 17:42
 */
@RestController
@RequestMapping("/consumer/eureka_discovery")
public class ConsumerEurekaDiscoveryController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001/microservice-provider";
    //采用ribbon负载均衡，地址直接写服务的名称
    private static final String REST_URL_PREFIX = "http://microservice-provider/microservice-provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/list")
    public Object getServiceList() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/eureka_discovery/list", Object.class);
    }
}
