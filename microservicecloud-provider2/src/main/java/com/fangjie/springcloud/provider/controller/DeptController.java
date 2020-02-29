package com.fangjie.springcloud.provider.controller;

import com.fangjie.springcloud.api.bean.Dept;
import com.fangjie.springcloud.provider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:31
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService iDeptService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list() {
        System.out.println("provider02");
        return iDeptService.findAll();
    }

    @RequestMapping(value = "/get/{deptId}", method = RequestMethod.GET)
    public Dept get(@PathVariable("deptId") Long deptId) {
        return iDeptService.getById(deptId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return iDeptService.createDept(dept);
    }
}
