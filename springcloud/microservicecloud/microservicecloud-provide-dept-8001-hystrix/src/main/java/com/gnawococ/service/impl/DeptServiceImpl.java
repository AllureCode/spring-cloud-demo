package com.gnawococ.service.impl;

import com.gnawococ.dao.IDeptDao;
import com.gnawococ.service.IDeptService;
import com.gnawococ.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springcloudProject
 * @description: 部门服务实现层
 * @author: wang_sir
 * @create: 2020-05-16 15:53
 **/
@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    IDeptDao deptDao;
    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }
}
