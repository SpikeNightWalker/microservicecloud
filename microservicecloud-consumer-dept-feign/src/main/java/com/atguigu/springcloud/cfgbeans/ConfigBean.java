package com.atguigu.springcloud.cfgbeans;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Spike on 2020/4/8.
 */
@Configuration
public class ConfigBean {

    /**
     * 加个注解就实现了客户端的负载均衡
     * @return
     */
//    @Bean
//    @LoadBalanced
//    public RestTemplate getRestTemplate() {
//        return new RestTemplate();
//    }


    /**
     * Ribbon默认使用轮询策略
     * 我们可以通过注入IRule，来覆盖默认策略
     * 总共有7种策略
     * 修改后要重启客户端
     * @return
     */
//    @Bean
//    public IRule myRule() {
//        return new RandomRule();
//    }
}