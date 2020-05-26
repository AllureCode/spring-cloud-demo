package com.gnawococ.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloudProject
 * @description:
 * @author: wang_sir
 * @create: 2020-05-26 11:00
 **/
@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.server-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig(){
        String str="applicationName"+applicationName+"--->eurekaServers"+eurekaServers+"" +
                "---->port"+port;
        System.out.println(str);
        return str;
    }
}
