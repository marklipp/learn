package com.yss.springbootmybatis.dao;

import com.yss.springbootmybatis.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DepartmentMapper {
    int deleteByPrimaryKey(String id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    Department oneToManyQuery(String id);

    Department oneToManyQueryTwo(String id);

    Department selectDepartmentById(String id);

    Department returnJaveType(String id);
}