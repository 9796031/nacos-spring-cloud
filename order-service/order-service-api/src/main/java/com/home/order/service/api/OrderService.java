package com.home.order.service.api;

/**
 * @author liqingdong
 * 订单接口
 */
public interface OrderService {
    /**
     * 服务接口
     * @return 无
     */
    String service();

    /**
     * 调用stock服务
     * @return 无
     */
    String stock();
}
