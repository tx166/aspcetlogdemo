package com.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author TangXin
 * @Date 2023-03-11 15:03
 * @Description
 */
@SpringBootApplication
@EnableFeignClients
public class StockApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class,args);
        System.out.println("stock启动成功");
    }
}
