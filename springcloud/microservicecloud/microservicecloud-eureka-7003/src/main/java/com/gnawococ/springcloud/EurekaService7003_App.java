package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: springcloudProject
 * @description: euraka服务启动类
 * @author: wang_sir
 * @create: 2020-05-16 18:19
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaService7003_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7003_App.class,args);
    }
}
