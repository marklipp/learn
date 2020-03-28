package com.yss.springbootmybatis.service;

import com.yss.springbootmybatis.dao.TDemoUserMapper;
import com.yss.springbootmybatis.dao.UserMapper;
import com.yss.springbootmybatis.entity.TDemoUser;
import com.yss.springbootmybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User findById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public void addUser(User user) {
        userMapper.insertSelective(user);
    }

    public void deleteById(String id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public User oneToOneQuery(String id) {
        return userMapper.oneToOneQuery(id);
    }

//    public List<User> oneToManyQuery(String id) {
//        return userMapper.oneToManyQuery(id);
//    }
}
