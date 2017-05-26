package com.lvshun.biz.impl;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import com.lvshun.server.UserServer;
import com.lvshun.vo.User;
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

    //注册代码
    public int addUser(User user) {
       Users  use = new Users();
       use.setUsername(user.getUsername());
       use.setPassword(user.getPassword());
       use.setPhone(user.getMobile());

       return userServer.addUser(use);
    }

    //登录
    public  int selectlogin(User user){
        Users  use = new Users();
        use.setUsername(user.getUsername());
        use.setPassword(user.getPassword());
        return  userServer.selectlogin(use);
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
