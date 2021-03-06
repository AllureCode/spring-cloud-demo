package com.gnawococ.springcloud.dao;

import com.gnawococ.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: wang_sir
 * @Description: 部门DAO层
 * @Date: 19:37 2020/5/15
 * @Param:
 * @return:
 **/
@Mapper
public interface IDeptDao {

    /**
     * 添加部门
     * @param dept
     * @return true/false
     */
    boolean addDept_8002(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return Dept
     */
    Dept findById_8002(Long id);

    /**
     * 查询所有部门
     * @param
     */
    List<Dept> findAll_8002();
}
