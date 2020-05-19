package com.gnawococ.springcloud.dao;

import com.gnawococ.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IDeptDao {

    /**
     * 添加部门
     * @param dept
     * @return true/false
     */
    boolean addDept_8004(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return Dept
     */
    Dept findById_8004(Long id);

    /**
     * 查询所有部门
     * @param
     */
    List<Dept> findAll_8004();
}
