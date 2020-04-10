package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * Created by Spike on 2020/4/8.
 */
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
