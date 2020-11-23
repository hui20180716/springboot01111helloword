package com.kuang.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.kuang.springcloud.pojo.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {
    public  boolean addDept(Dept dept);
    public Dept queryById(Long id);
    public List<Dept> queryAll();
}
