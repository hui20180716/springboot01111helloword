package com.kuang.springcloud.Controller;

import com.kuang.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kuang.springcloud.pojo.Dept;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return  deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept getById(@PathVariable("id") Long id){
        Dept dept = deptService.queryById(id);
        if(dept ==null){
            throw new RuntimeException("id=>"+id+",不存在该用户");
        }
        return  deptService.queryById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll(){
        return  deptService.queryAll();
    }
}
