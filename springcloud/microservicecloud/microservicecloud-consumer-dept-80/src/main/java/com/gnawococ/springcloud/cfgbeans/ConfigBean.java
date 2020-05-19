package com.gnawococ.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloudProject
 * @description: Bean配置类
 * @author: wang_sir
 * @create: 2020-05-16 17:09
 **/
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //添加负载均衡
    public RestTemplate getRestTemple(){
        return new RestTemplate();
    }
}
