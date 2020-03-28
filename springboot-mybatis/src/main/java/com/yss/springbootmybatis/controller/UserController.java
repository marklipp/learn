package com.yss.springbootmybatis.controller;

import com.yss.springbootmybatis.dao.DepartmentMapper;
import com.yss.springbootmybatis.dao.UserMapper;
import com.yss.springbootmybatis.entity.Department;
import com.yss.springbootmybatis.entity.TDemoUser;
import com.yss.springbootmybatis.entity.User;
import com.yss.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping(value = {"userfindById/{id}"})
    public User userfindById(@PathVariable String id){
        User user = userService.findById(id);
        return user;
    }

    @RequestMapping(value = {"add"})
    public String add(@RequestBody User user){
        userService.addUser(user);
        return "add";
    }

    @RequestMapping(value = {"update"})
    public String update(@RequestBody User user){
        userService.addUser(user);
        return "update";
    }

    @RequestMapping(value = {"delete/{id}"})
    public String delete(@PathVariable String id){
        userService.deleteById(id);
        return "delete";
    }

    @RequestMapping(value = {"oneToOne/{id}"})
    public User oneToOneQuery(@PathVariable String id){
        User user = userService.oneToOneQuery(id);
        return user;
    }
    @RequestMapping(value = {"oneToOneTwo/{id}"})
    public User oneToOneQueryTwo(@PathVariable String id){
        User user = userMapper.oneToOneQueryTwo(id);
        return user;
    }


}
