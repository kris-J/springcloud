package com.fangjie.springcloud.provider.service;

import com.fangjie.springcloud.api.bean.Dept;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:09
 */
public interface IDeptService {

    List<Dept> findAll();

    Dept getById(Long deptId);

    boolean createDept(Dept dept);
}
