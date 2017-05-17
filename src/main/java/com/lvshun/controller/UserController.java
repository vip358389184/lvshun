package com.lvshun.controller;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by baolong on 2017/4/19.
 */
@Controller
@RequestMapping("/user" )
public class UserController  {


    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());

    @Autowired
    private UserBiz userBiz;

    @ResponseBody
    @RequestMapping(value="/findAll")
    public List<Users> findAll(){
        List<Users> userList = userBiz.findAll();
        return  userList;
    }


    @ResponseBody
    @RequestMapping(value="/addUser")
    public ReturnMessage addUser(@RequestBody User user){
        logger.info(user);
        userBiz.addUser(user);
        return  ReturnMessage.SUCCESS;
    }


    @ResponseBody
    @RequestMapping(value="/selectlogin")
    public ReturnMessage selectlogin(@RequestBody User user){
        int count = userBiz.selectlogin(user);
        logger.info("count:"+count);
       if(count>0){

            logger.info(user);
            logger.info("CG");

            return  ReturnMessage.SUCCESS;
       }else {

           logger.info("SB");
           return ReturnMessage.ERROR;
       }
    }


}
