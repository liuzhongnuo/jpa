package com.offcn.jpa.service;

import com.offcn.jpa.pojo.User;

import java.util.List;

public interface UserService {
    //新增用户
    public void add(User user);
    //修改用户
    public void update(Long id,User user);
    //删除用户
    public void delete(Long id);
    //根据id查询用户
    public User findOne(Long id);
    //获取全部用户
    public List<User> findAll();
    //
}
