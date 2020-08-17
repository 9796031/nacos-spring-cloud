
# nacos-spring-cloud
# 1 项目整体架构图
![image](https://note.youdao.com/yws/public/resource/13db7cffb0296d27a93c782ac9c77de2/xmlnote/690C6D7ECCD6497589A5AE686D128810/13206)
# 2 配置
data ID配置
```gateway.yaml```  
group: ```ORDER_SERVER```

配置内容
```yml
zuul:
  routes:
    order_server:
      stripPrefix: false
      path: /order_server/**
```
# 3 测试order-server
```$xslt
localhost:8081/order_server/order
```
# 4 order server通过dubbo协议调用order service impl类
```$xslt
localhost:8081/order_server/order/service
```

# 5 通过网关访问order server, order server通过dubbo协议调用order service impl
```$xslt
localhost:8080/order_server/order/service
```
# 6 网关->order-server->order-service-impl->stock-service-impl调用链
```http request
localhost:8080/order_server/order/stock
```
# 7 网关 -> order-server -> stock-service-impl
```http request
localhost:8080/order_server/stock
```