package com.gnawococ.springcloud.controller;

import com.gnawococ.springcloud.entity.Dept;
import com.gnawococ.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: springcloudProject
 * @description: 8004控制类
 * @author: wang_sir
 * @create: 2020-05-19 20:56
 **/
@RestController
public class DeptController {
    @Autowired
    private IDeptService deptService;

    @Autowired
    private DiscoveryClient client;

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

    @GetMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = client.getServices();
        System.out.println("注册的服务对象-------->"+services);
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance:instances){
            System.out.println(instance.getHost()+""+instance.getPort()+""+instance.getUri());
        }
        return this.client;
    }
}
