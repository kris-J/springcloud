package com.fangjie.springcloud.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 17:42
 */
@RestController
@RequestMapping("/eureka_discovery")
public class EurekaDiscoveryController {

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @RequestMapping("/list")
//    public Object getServiceList() {
//        List<String> services = discoveryClient.getServices();
//        System.out.println(services);
//        List<ServiceInstance> instances = discoveryClient.getInstances("microservice-provider");
//        for (ServiceInstance instance : instances) {
//            System.out.println(instance.getServiceId() + ":" + instance.getPort() + ":" + instance.getUri());
//        }
//        return discoveryClient;
//    }
}
