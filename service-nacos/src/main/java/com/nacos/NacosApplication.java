package com.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author TangXin
 * @Date 2023-03-11 14:15
 * @Description
 */
@SpringBootApplication
//@EnableDiscoveryClient//从Spring Cloud Edgware开始，@EnableDiscoveryClient可省略。只需加上相关依赖，并进行相应配置，即可将微服务注册到服务发现组件上。
public class NacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class,args);
        System.out.println("NacosApplication,启动完毕");
    }
}
