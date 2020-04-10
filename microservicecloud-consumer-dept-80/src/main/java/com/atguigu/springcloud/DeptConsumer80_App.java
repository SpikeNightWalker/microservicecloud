package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Spike on 2020/4/8.
 */
@SpringBootApplication
@EnableEurekaClient
/*
    在启动该微服务的时候就能去加载我们的自定义Ribbon负载均衡配置类，从而使配置生效
    这个负载均衡策略针对MICROSERVICECLOUD-DEPT服务
    注意坑：MySelfRule自定义类不能放在@ComponentScan扫描的包下面，即不能放在DeptConsumer80_App这个主启动类的包下面
    这里指定了configuration=MySelfRule.class之后，ConfigBean配置的IRule就不生效了
 */
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
