package com.gnawococ.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
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

    /**
     *@Author:  wang_sir
     * @Description: 采用随机算法替代默认的轮询算法
     * @Date: 19:34 2020/5/21
     * @Param: []
     * @return: com.netflix.loadbalancer.IRule
     **/
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
