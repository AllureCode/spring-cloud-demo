package com.gnawococ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloudProject
 * @description: 部门8001提供者启动类
 * @author: wang_sir
 * @create: 2020-05-16 16:05
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001_APP {
    public static void main(String[] args) {
         SpringApplication.run(DeptProvider8001_APP.class,args);
    }
}
