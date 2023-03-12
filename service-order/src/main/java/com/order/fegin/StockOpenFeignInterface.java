package com.order.fegin;

import com.demo.common.BizResponse;
import com.order.aspect.OperAroundLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author TangXin
 * @Date 2023-03-11 16:31
 * @Description
 */
@FeignClient(name = "service-stock",path = "/stock")
public interface StockOpenFeignInterface {

    @OperAroundLog
    @GetMapping("/subStock")
    BizResponse<String> subStock();

    @OperAroundLog
    @GetMapping("/addStock")
    BizResponse<String> addStock();
}
