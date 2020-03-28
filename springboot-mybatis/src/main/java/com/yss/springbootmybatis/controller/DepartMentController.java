package com.yss.springbootmybatis.controller;

import com.yss.springbootmybatis.dao.DepartmentMapper;
import com.yss.springbootmybatis.entity.Department;
import com.yss.springbootmybatis.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/department/")
public class DepartMentController {
    @Autowired
    private DepartmentMapper departmentMapper;
    @RequestMapping(value = {"oneToMany/{id}"})
    public Department oneToManyQuery(@PathVariable String id){
        Department department= departmentMapper.oneToManyQuery(id);
        return department;
    }
    @RequestMapping(value = {"oneToManyTwo/{id}"})
    public Department oneToManyTwo(@PathVariable String id){
        Department department= departmentMapper.oneToManyQueryTwo(id);
        return department;
    }
    @RequestMapping(value = {"returnJaveType/{id}"})
    public Department returnJaveType(@PathVariable String id){
        Department department= departmentMapper.returnJaveType(id);
        return department;
    }



}
