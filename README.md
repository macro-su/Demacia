### springcloud技能点

#### eureka 服务治理组件，包含服务注册与发现
> eureka是阿基米德洗澡时发现浮力原理时发出的惊叹声，在微服务中寓意发现
#### Hystrix 容错管理组件，实现了熔断器
#### Ribbon 客户端负载均衡的服务调用组件
#### Feign 基于Ribbon和Hystrix的声明式服务调用组件
#### Zuul 网关组件，提供智能路由、访问过滤等功能

> hosts 
127.0.0.1 server1
127.0.0.1 server2
127.0.0.1 server3

> idea 
Vm options:社区版开启彩色日志
-Dspring.output.ansi.enabled=ALWAYS
Projram arguments:设置profiles文件
--spring.profiles.active=server1

