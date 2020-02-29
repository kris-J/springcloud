package com.fangjie.springcloud.provider.dao;

import com.fangjie.springcloud.api.bean.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2020/2/23 16:58
 */
@Mapper
public interface IDeptDao {

    List<Dept> findAll();

    Dept getById(Long deptId);

    boolean createDept(Dept dept);
}
