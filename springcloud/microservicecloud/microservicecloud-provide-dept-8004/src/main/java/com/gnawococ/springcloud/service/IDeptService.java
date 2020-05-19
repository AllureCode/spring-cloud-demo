package com.gnawococ.springcloud.service;

import com.gnawococ.springcloud.entity.Dept;

import java.util.List;

/**
 * @Author:  wang_sir
 * @Description: 部门服务层
 * @Date: 15:52 2020/5/16
 * @Param:
 * @return:
 **/

public interface IDeptService {
    /**
     * 添加部门
     * @param dept
     * @return true/false
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return Dept
     */
    Dept findById(Long id);

    /**
     * 查询所有部门
     * @param
     */
    List<Dept> findAll();
}
