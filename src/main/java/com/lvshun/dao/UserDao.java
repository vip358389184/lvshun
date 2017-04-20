package com.lvshun.dao;

import com.lvshun.po.Users;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
public interface UserDao {
    //注册用户
    public void addUser(Users user);
    //查询全部用户
    public List<Users> findAll();
    //查询用户详细
    public Users getById(String id);
    //删除用户
    public void delete(String id);
    //修改用户
    public void update(Users user);
}
