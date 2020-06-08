# springboot-dubbo
参考：https://blog.csdn.net/houpeibin2012/article/details/104478122
Demo采用SpringBoot2.3+Dubbo2.7.7
步骤：
1、下载zookeeper
    启动：docker run --name some-zookeeper -p 2181:2181 --restart always -d 镜像ID
2、编写dubbo-api
    新建modelTestDubboData和接口TestDubboService
3、编写服务提供者dubbo-provider
    1.引入相关依赖：dubbo-api、dubbo-spring-boot-starter、dubbo-dependencies-zookeeper
    2.实现接口类：TestDubboServiceImp并用注解@Service(version = "${provider.service.version}")标记
    3.application.properties配置文件配置
4、编写dubbo-consumer（参考第三步）
