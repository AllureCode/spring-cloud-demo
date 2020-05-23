package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-23 10:47
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableHystrixDashboard
public class DashBoard9001_APP {
    public static void main(String[] args) {
        SpringApplication.run(DashBoard9001_APP.class,args);
    }
}
