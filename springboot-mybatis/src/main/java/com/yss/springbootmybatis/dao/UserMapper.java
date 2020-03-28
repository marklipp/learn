package com.yss.springbootmybatis.dao;

import com.yss.springbootmybatis.entity.Department;
import com.yss.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll(String id);

    User oneToOneQuery(String id);

    List<User> selectByDepartmentId(String departmentId);

    User oneToOneQueryTwo(String id);

}