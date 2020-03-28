package com.yss.springbootmybatis.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
//@JsonIgnoreProperties(value = { "handler" })
public class Department {
    private String id;

    private String name;

    private List<User> users;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}