package com.home.order.server.controller;

import com.home.order.service.api.OrderService;
import com.home.stock.service.api.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liqingdong
 * order 对外提供的服务
 */
@RestController
public class OrderController {
    /**
     * 注入service(基于dubbo)
     * 会生成OrderService类的代理对象进行远程调用
     */
    @org.apache.dubbo.config.annotation.Reference
    private OrderService orderService;

    @org.apache.dubbo.config.annotation.Reference
    private StockService stockService;

    @GetMapping("/stock")
    public String stock() {
        return "order server invoke success !!! and " + stockService.service();
    }

    /***
     * order-service-impl -> stock-service-impl
     */
    @GetMapping("/order/stock")
    public String orderStock() {
        return "order server invoke success !!! and " + orderService.stock();
    }

    /**
     * order-service-impl
     */
    @GetMapping("/order/service")
    public String orderService() {
        return "order server invoke " + orderService.service();
    }

    /** 需要注入service, 基于dubbo*/
    @GetMapping("/order")
    public String service() {
        return "test";
    }
}
