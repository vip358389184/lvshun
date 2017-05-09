package com.lvshun.biz.impl;

import com.lvshun.biz.UserBiz;
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
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserServer userServer;

    public int addUser(String userid, String username, String password) {
        return userServer.addUser(userid,username,password);
    }

    public List<Users> findAll() {
        return userServer.findAll();
    }

    public Long getTotal(Map<String, Object> map) {
        return userServer.getTotal(map);
    }

    public Users getById(String id) {
        return userServer.getById(id);
    }

    public int delete(String id) {
return userServer.delete(id);
    }

    public int update(Users user)
    {
return userServer.update(user);
    }
}
