package com.gnawococ.springcloud.service;

import com.gnawococ.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: springcloudProject
 * @description: hystrix异常处理fallbackMethod的解耦实现
 * @author: wang_sir
 * @create: 2020-05-22 10:54
 **/
//不添加无法使用
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {

                return new Dept().setId(Math.toIntExact(id)).setDname("该id"+id+"" +
                        "没有对应的信息，Consumer客户端提供的降级信息，此刻服务provide已经关闭")
                        .setDb_source("no this database MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
