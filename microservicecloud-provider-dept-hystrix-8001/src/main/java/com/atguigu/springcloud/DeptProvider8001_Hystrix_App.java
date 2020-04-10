package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Spike on 2020/4/8.
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
//@EnableDiscoveryClient
//@EnableHystrix
@EnableCircuitBreaker   //开启回路断路器，对hystrixR熔断机制的支持
public class DeptProvider8001_Hystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
    }
}
