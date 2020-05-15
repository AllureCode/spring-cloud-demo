package com.gnawococ.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: springcloudProject
 * @description: 部门
 * @author: wang_sir
 * @create: 2020-05-14 21:38
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 部门id
     */
    private Integer id;
    /**
     * 部门名称
     */
    private String dname;
    /**
     * 来自那个数据库，因为微服架构可以一个服务对应一个数据库
     */
    private String db_source;
}
