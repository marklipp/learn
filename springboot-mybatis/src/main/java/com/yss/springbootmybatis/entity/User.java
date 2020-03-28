package com.yss.springbootmybatis.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
//@JsonIgnoreProperties(value = { "handler" })
public class User {
    private String id;

    private String name;

    private String age;

    private Department department;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


}