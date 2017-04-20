package com.lvshun.server.impl;

import com.lvshun.dao.UserDao;
import com.lvshun.po.Users;
import com.lvshun.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
@Service
public class UserServerImpl implements UserServer{
  @Autowired
  private UserDao userDao;

    public void addUser(Users user) {
        userDao.addUser(user);
    }

    public List<Users> findAll() {
        List<Users> list = userDao.findAll();
        return list;
    }

    public Users getById(String id) {
        return userDao.getById(id);
    }

    public void delete(String id) {
       userDao.delete(id);
    }

    public void update(Users user) {
         userDao.update(user);
    }
}
