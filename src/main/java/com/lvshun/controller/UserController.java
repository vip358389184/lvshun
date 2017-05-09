package com.lvshun.controller;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import com.lvshun.util.ResponseUtil;
import com.lvshun.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by baolong on 2017/4/19.
 */
@Controller
@RequestMapping("/user" )
public class UserController  {
    @Autowired
    private UserBiz userBiz;

    @ResponseBody
    @RequestMapping(value="/findAll")
    public List<Users> findAll(){
        List<Users> userList = userBiz.findAll();
        return  userList;
    }
}
