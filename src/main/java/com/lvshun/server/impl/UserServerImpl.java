package com.lvshun.server.impl;

import com.lvshun.dao.UserDao;
import com.lvshun.po.Users;
import com.lvshun.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 宝龙 on 2017/4/19.
 */
@Service
public class UserServerImpl implements UserServer{
    @Autowired
    private UserDao userDao;


  //注册
    public  int addUsers(Users users){
        return  userDao.addUsers(users);
    }

    //登录
    public  int selectlogin(Users users){

        return userDao.selectlogin(users);
    }

    public List<Users> findAll() {
        return userDao.findAll();
    }

    public Long getTotal(Map<String, Object> map) {
        return null;
    }

    public Users getById(String id) {
        return userDao.getById(id);
    }

    public int delete(String id) {
        return userDao.delete(id);
    }

    public int update(Users user)
    {
        return userDao.update(user);
    }
}
