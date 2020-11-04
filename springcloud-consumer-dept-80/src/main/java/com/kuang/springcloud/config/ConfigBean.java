package com.kuang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //配置类
public class ConfigBean {
        @Bean
        public RestTemplate getRestTemplate(){
                return  new RestTemplate();
        }
}
