package com.gnawococ.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloudProject
 * @description: 自定义Ribbon
 * @author: wang_sir
 * @create: 2020-05-21 20:16
 **/
@Configuration
public class MyRule {
//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }

    @Bean
    public IRule myRule_wxh(){
        return new RandomRule_WXH();
    }
}
