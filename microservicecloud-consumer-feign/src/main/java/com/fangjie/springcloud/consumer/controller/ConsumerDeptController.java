package com.fangjie.springcloud.consumer.controller;

import com.fangjie.springcloud.api.bean.Dept;
import com.fangjie.springcloud.consumer.service.IDeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/24 13:50
 */
@RestController
@RequestMapping("/consumer/dept")
public class ConsumerDeptController {

    @Autowired
    private IDeptFeignService deptFeignService;

    @RequestMapping("/add")
    public boolean add(Dept dept) {
        return deptFeignService.createDept(dept);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list() {
        return deptFeignService.findAll();
    }

    @RequestMapping(value = "/get/{deptId}")
    public Dept get(@PathVariable("deptId") Long deptId) {
        return deptFeignService.getById(deptId);
    }
}
