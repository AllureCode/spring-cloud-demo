package com.gnawococ.controller;

import com.gnawococ.service.IDeptService;
import com.gnawococ.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloudProject
 * @description: 部门控制层
 * @author: wang_sir
 * @create: 2020-05-16 15:57
 **/
@RestController
public class DeptController {
    @Autowired
    private IDeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptService.findById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }
}
