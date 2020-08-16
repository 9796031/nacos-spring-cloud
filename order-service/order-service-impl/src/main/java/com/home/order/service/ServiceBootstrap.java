package com.home.order.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liqingdong
 * order service启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBootstrap.class, args);
    }
}
