package com.fangjie.springcloud.consumer.service;

import com.fangjie.springcloud.api.bean.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author fangjie
 * @Description: Feign配置接口
 * @date 2020/2/27 14:28
 */
//Feign声明，并声明服务
@FeignClient(name = "microservice-provider")
public interface IDeptFeignService {

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> findAll();

    @RequestMapping(value = "/dept/get/{deptId}", method = RequestMethod.GET)
    Dept getById(@PathVariable("deptId") Long deptId);

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean createDept(@RequestBody Dept dept);
}
