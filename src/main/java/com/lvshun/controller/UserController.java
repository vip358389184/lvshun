package com.lvshun.controller;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
@Controller
@RequestMapping("/user" )
public class UserController  {
    @Autowired
    private UserBiz userBiz;
    @RequestMapping("/getAllUser")
    public  @ResponseBody
    List<Users> getAll( ){

        return userBiz.findAll();
    }
    @RequestMapping("/addUser")
    public @ResponseBody
    void addUser( Users users){
        userBiz.addUser(users);
    }
    @RequestMapping("/delUser")
    public @ResponseBody
    void  deleteUser(String  id){
        userBiz.delete(id);
    }
    @RequestMapping("/updateUser")
    public @ResponseBody
    void updateUser(Users users){
        userBiz.update(users);
    }
}
