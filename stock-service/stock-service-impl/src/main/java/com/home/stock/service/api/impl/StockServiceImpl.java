package com.home.stock.service.api.impl;

import com.home.stock.service.api.StockService;

/**
 * @author liqingdong
 * 测试dubbo协议调用接口
 */
@org.apache.dubbo.config.annotation.Service
public class StockServiceImpl implements StockService {
    public String service() {
        return "stock impl invoke success !!!";
    }
}
