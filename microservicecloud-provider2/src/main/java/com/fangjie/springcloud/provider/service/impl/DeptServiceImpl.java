package com.fangjie.springcloud.provider.service.impl;

import com.fangjie.springcloud.api.bean.Dept;
import com.fangjie.springcloud.provider.dao.IDeptDao;
import com.fangjie.springcloud.provider.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 17:10
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao iDeptDao;

    @Override
    public List<Dept> findAll() {
        return iDeptDao.findAll();
    }

    @Override
    public Dept getById(Long deptId) {
        return iDeptDao.getById(deptId);
    }

    @Override
    public boolean createDept(Dept dept) {
        return iDeptDao.createDept(dept);
    }
}
