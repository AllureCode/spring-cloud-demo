package com.gnawococ.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-23 15:39
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableZuulProxy
public class Zuul_9527_APP {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9527_APP.class,args);
    }
}
