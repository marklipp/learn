package com.yss.springbootmybatis.dao;

import com.yss.springbootmybatis.entity.TDemoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface TDemoUserMapper {

    int insert(TDemoUser record);

    TDemoUser userfindById(String id);

    List<TDemoUser> selectList(Map<String, String> parms);

    int updateByPrimaryKey(TDemoUser record);

}