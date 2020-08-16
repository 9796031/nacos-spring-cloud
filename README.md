# nacos-spring-cloud
# 1 测试order-server
```$xslt
localhost:8081/order_server/order
```
# 2 order server通过dubbo协议调用order service impl类
```$xslt
localhost:8081/order_server/order/service
```

# 3 通过网关访问order server, order server通过dubbo协议调用order service impl
```$xslt
localhost:8080/order_server/order/service
```