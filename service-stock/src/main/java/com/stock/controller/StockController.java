package com.stock.controller;

import com.demo.common.BizResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author TangXin
 * @Date 2023-03-11 15:07
 * @Description
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    public String test(){
        return "stock调用成功";
    }

    @GetMapping("/subStock")
    public BizResponse<String> subStock(){
        System.out.println("service-stock，扣减库存，数量=");
        return new BizResponse("200","扣减库存成功",null);
    }

    @GetMapping("/addStock")
    public BizResponse<String> addStock(int num){
        System.out.println("service-stock，添加库存，数量=");
        return new BizResponse("200","添加库存成功",null);
    }
}
