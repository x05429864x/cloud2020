package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {


    //标注此注解后，RestTemplate就具有了客户端负载均衡能力
    //必须添加此注解，否则java.net.UnknownHostException: CLOUD-PAYMENT-SERVICE
    //@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}