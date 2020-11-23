package com.kuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP和端口号；
@SpringBootApplication
@EnableEurekaClient//在服务启动后自动注册进
public class DeptConsumer_80 {
        public static void main(String[] args) {
                SpringApplication.run(DeptConsumer_80.class,args);
        }

}
