package com.gnawococ.controller;

import com.gnawococ.service.IDeptService;
import com.gnawococ.springcloud.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {

        Dept dept = deptService.findById(id);
        if (dept == null) {
            throw new RuntimeException("该" + id + "没有对应的部门信息");
        }
        return dept;
    }

    /**
     * @Author: wang_sir
     * @Description: 当查询public Dept get(@PathVariable("id") Long id)方法出现
     * 异常 则通过hystrix调用此方法对异常进行处理
     * @Date: 10:22 2020/5/22
     * @Param: [id]
     * @return: com.gnawococ.springcloud.entity.Dept
     **/
    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        return new Dept().setId(Math.toIntExact(id)).setDname("该id" + id + "没有对应的信息，null---@hystrixCommand")
                .setDb_source("no this database in Mysql");
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.findAll();
    }

    /**
     * @Author: wang_sir
     * @Description:  public Object discovery() eureka的服务发现
     * 可以通过此方法查看当前eureka中注册的服务信息
     * @Date: 10:25 2020/5/22
     * @Param: []
     * @return: java.lang.Object
     **/
    @GetMapping("/dept/discovery")
    public Object discovery() {
        List<String> services = client.getServices();
        System.out.println("注册的服务对象-------->" + services);
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "" + instance.getPort() + "" + instance.getUri());
        }
        return this.client;
    }

}
