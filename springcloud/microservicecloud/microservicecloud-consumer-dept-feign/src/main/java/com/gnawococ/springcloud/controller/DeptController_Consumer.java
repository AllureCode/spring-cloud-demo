package com.gnawococ.springcloud.controller;



import com.gnawococ.springcloud.entity.Dept;
import com.gnawococ.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springcloudProject
 * @description: 部门消费者控制类
 * @author: wang_sir
 * @create: 2020-05-16 17:16
 **/
@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }
    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return service.list();
    }

}
