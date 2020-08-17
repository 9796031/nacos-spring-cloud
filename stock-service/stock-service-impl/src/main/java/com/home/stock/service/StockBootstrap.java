package com.home.stock.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liqingdong
 * 库存启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(StockBootstrap.class, args);
    }
}
