package com.lvshun.biz.impl;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import com.lvshun.server.UserServer;
import com.lvshun.util.enmoUtil.MainEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
@Service
public class UserBizImpl implements UserBiz {
    @Autowired
    private UserServer userServer;


    public void addUser(Users user ) {
        Users users = new Users();
        userServer.addUser(users);
    }

    public  @ResponseBody
    List<Users> findAll() {
        Users users = new Users();

        return userServer.findAll();
    }

    public Users getById(String id) {
        Users users = new Users();

        return userServer.getById(users.getUserId());
    }

    public void delete(String id) {
        Users users = new Users();
        userServer.delete(users.getUserId());
    }

    public void update(Users user) {
        Users users = new Users();
        userServer.update(users);
    }
}
