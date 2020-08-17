package com.home.order.service.api.impl;

import com.home.order.service.api.OrderService;
import com.home.stock.service.api.StockService;

/**
 * @author liqingdong
 * order service接口实现
 */
@org.apache.dubbo.config.annotation.Service // 标记接口为dubbo协议接口
public class OrderServiceImpl implements OrderService {

    @org.apache.dubbo.config.annotation.Reference
    private StockService stockService;

    public String service() {
        return "order service impl invoke !!!";
    }

    public String stock() {
        return "order service impl invoke success !!! and " + stockService.service();
    }
}
