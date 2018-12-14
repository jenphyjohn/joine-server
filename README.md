# joine-server
基于Spring Cloud微服务服务端框架
<p align="center">
  <img src="https://img.shields.io/badge/Spring%20Cloud-EdgwareSR4-orange.svg" alt="Coverage Status">
  <img src="https://img.shields.io/badge/Spring%20Boot-1.5.13-blue.svg" alt="Downloads">
  <img src="https://img.shields.io/npm/v/npm.svg" alt="Version">
  <img src="https://img.shields.io/hexpm/l/plug.svg" alt="License">
</p>

## 简介

### 功能
- 完善登录：账号密码模式、短信验证码模式、社交账号模式均整合Spring Security OAuth
- 单点登录：基于Srping Security OAuth 提供单点登录接口，方便其他系统对接
- 用户管理：用户是系统操作者，该功能主要完成系统用户配置。
- 机构管理：配置系统组织机构，树结构展现，可随意调整上下级。
- 菜单管理：配置系统菜单，操作权限，按钮权限标识等。
- 角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
- 动态路由：基于zuul实现动态路由，后端可配置化。
- 灰度发布：自定义ribbon路由规则匹配多版本请求。
- 终端管理：动态配置oauth终端，后端可配置化。
- 字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否等。
- 操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
- 服务限流：多种维度的流量控制（基于服务、IP、用户等）
- 消息总线：配置动态实时刷新
- 分库分表：shardingdbc分库分表策略
- 数据权限: 使用mybatis对原查询做增强，业务代码不用控制，即可实现。
- 文件系统: 支持FastDFS、七牛云，扩展API几行代码实现上传下载
- 消息中心：短信、邮件模板发送，几行代码实现发送
- 聚合文档：基于zuul实现 swagger各个模块的实现
- 代码生成：前后端代码的生成，支持Vue
- 缓存管理：基于Cache Cloud 保证Redis 的高可用
- 服务监控: Spring Boot Admin
- 分布式任务调度： 基于elastic-job的分布式文件系统，zookeeper做调度中心
- zipkin链路追踪： 数据保存ELK，图形化展示
- pinpoint链路追踪： 数据保存hbase，图形化展示

 ### 模块
``` lua
joine
├── joine-ui -- element-vue-admin实现[8000]
├── joine-auth -- 授权服务提供[9172]
├── joine-common -- 系统公共模块 
├── joine-config -- 配置中心[9171]
├── joine-eureka -- 服务注册与发现[9170]
├── joine-gateway -- ZUUL网关[9173]
├── joine-modules -- 微服务模块
├    ├── joine-daemon-service -- 分布式调度中心[9177]
├    ├── joine-mc-service -- 消息中心[9176]
├    ├── joine-sso-client-demo -- 单点登录客户端示例[9175]
├    └── joine-upms-service -- 权限管理提供[9174]
└── joine-visual  -- 图形化模块 
     ├── joine-monitor -- 服务状态监控、turbine [9178]
     ├── joine-zipkin-elk -- zipkin、ELK监控[9179、9180]
     └── joine-cache-cloud -- 缓存管理、统一监控[9181]
```

### 截图