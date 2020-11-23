package com.kuang.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Configuration //配置类
public class ConfigBean {
        //配置负载均衡实现RestTemplate
        //RoundRobinRule 轮询
        //RandomRule 随机
        //AvailabilityFilteringRule; 会过滤掉跳闸的服务
        //RetryRule 会先轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
        @Bean
        @LoadBalanced //Ribbon
        public RestTemplate getRestTemplate(){
                return  new RestTemplate();
        }

        //配置负载均衡实现RestTemplate
        @Bean
        public IRule myRule(){
                return new RandomRule();
        }
}
