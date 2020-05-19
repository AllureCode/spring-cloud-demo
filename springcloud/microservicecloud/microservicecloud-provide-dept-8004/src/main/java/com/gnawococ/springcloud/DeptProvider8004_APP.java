package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: springcloudProject
 * @description: 8004启动类
 * @author: wang_sir
 * @create: 2020-05-19 19:27
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8004_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8004_APP.class,args);
    }
}
