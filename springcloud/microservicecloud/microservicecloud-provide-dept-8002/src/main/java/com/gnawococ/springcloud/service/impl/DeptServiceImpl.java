package com.gnawococ.springcloud.service.impl;


import com.gnawococ.springcloud.dao.IDeptDao;
import com.gnawococ.springcloud.entity.Dept;
import com.gnawococ.springcloud.service.IDeptService;
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
        return deptDao.addDept_8002(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById_8002(id);
    }

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll_8002();
    }
}
