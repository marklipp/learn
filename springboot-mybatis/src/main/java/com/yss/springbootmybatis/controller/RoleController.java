package com.yss.springbootmybatis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yss.springbootmybatis.dao.RoleMapper;
import com.yss.springbootmybatis.entity.Role;
import com.yss.springbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role/")
public class RoleController {
    @Autowired
    private RoleMapper roleMapper;
    @RequestMapping("getAll")
    public PageInfo getAll(){
        PageHelper.startPage(1, 4);
        PageInfo<Role> pageInfo = new PageInfo<Role>(roleMapper.getAll());
        return pageInfo;
    }
}
