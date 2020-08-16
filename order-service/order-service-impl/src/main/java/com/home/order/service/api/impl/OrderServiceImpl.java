package com.home.order.service.api.impl;

import com.home.order.service.api.OrderService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author liqingdong
 * order service接口实现
 */
@org.apache.dubbo.config.annotation.Service // 标记接口为dubbo协议接口
public class OrderServiceImpl implements OrderService {

    public String service() {
        return "order service impl invoke !!!";
    }
}
