package com.order.controller;

import com.demo.common.BizResponse;
import com.order.aspect.OperAroundLog;
import com.order.fegin.StockOpenFeignInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author TangXin
 * @Date 2023-03-11 14:59
 * @Description
 */
@RestController
@RequiredArgsConstructor
public class OrderController {

    private final StockOpenFeignInterface stockOpenFeignInterface;

    @GetMapping("/order")
    public String test(){
        return "order调用成功";
    }

    @PostMapping("/addOrder")
    public BizResponse<String> addOrder(){
        System.out.println("service-order，下单");
        stockOpenFeignInterface.subStock();
        return new BizResponse("200","下单成功",null);
    }

    @PostMapping("/cancelOrder")
    public BizResponse<String> cancelOrder(){
        System.out.println("service-order，取消订单");
        stockOpenFeignInterface.addStock();
        return new BizResponse("200","取消订单成功",null);
    }



}
