package com.kuang.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.kuang.springcloud.pojo.Dept;

import java.util.List;

@RestController
public class DeptConsumerController {
        @Autowired
        private RestTemplate restTemplate;//提供多种便捷远程访问的http服务的方法，简单的restful服务模板
       //ribbon 我们这里的地址，应该是个变量，通过服务名来访问
       private  static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
//        private  static final String REST_URL_PREFIX="http://localhost:8001";
        @RequestMapping("/consumer/dept/get/{id}")
        public Dept get(@PathVariable("id")Long id){
            return  restTemplate.getForObject(  REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
        }
        @RequestMapping("/consumer/dept/add")
        public  boolean add(Dept dept){
                return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,boolean.class);
        }
        @RequestMapping("/consumer/dept/list")
        public List<Dept> list(){
                return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
        }
}
