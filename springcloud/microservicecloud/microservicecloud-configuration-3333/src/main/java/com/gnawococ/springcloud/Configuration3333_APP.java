package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-23 18:04
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableConfigServer
public class Configuration3333_APP {
    public static void main(String[] args) {
        SpringApplication.run(Configuration3333_APP.class,args);
    }
}
