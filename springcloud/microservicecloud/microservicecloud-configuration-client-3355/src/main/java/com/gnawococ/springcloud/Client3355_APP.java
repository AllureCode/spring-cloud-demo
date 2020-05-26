package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-26 10:29
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class Client3355_APP {
    public static void main(String[] args) {
        SpringApplication.run(Client3355_APP.class, args);
    }
}