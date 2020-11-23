package com.kuang.springcloud.server;

import com.kuang.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
@GetMapping("/dept/get/{id}")
    public Dept queryById(Long id);
    @GetMapping("/dept/list")
    public List<Dept> queryAll();
    @GetMapping("/dept/add")
    public boolean addDept(Dept dept);

}
