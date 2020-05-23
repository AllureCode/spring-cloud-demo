package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: springcloudProject
 * @description: 消费者启动类
 * @author: wang_sir
 * @create: 2020-05-16 17:28
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.gnawococ.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
