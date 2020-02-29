package com.fangjie.springcloud.consumer.controller;

import com.fangjie.springcloud.api.bean.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 13:50
 */
@RestController
@RequestMapping("/consumer/dept")
public class ConsumerDeptController {

//    private static final String REST_URL_PREFIX = "http://localhost:8001/microservice-provider";
    //采用ribbon负载均衡，地址直接写服务的名称
    private static final String REST_URL_PREFIX = "http://microservice-provider";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/get/{deptId}")
    public Dept get(@PathVariable("deptId") Long deptId) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get" + deptId, Dept.class);
    }
}
