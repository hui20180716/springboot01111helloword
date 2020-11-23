package com.kuang.springcloud.server;

import com.kuang.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;

import java.util.List;

public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept().setDeptno(id).setDname("没有").setDb_source("降级");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
