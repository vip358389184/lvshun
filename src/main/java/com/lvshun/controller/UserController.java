package com.lvshun.controller;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.Users;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

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
//添加
    @ResponseBody
    @RequestMapping(value="/saveUser")
    public ReturnMessage saveUser(@RequestBody User user){

        logger.info(user);

        return  ReturnMessage.SUCCESS;
    }
//删除
    @ResponseBody
    @RequestMapping("/delete")
    public String delete( HttpServletRequest request,Model model)throws Exception{
        String id= request.getParameter("id");
        int delCol = userBiz.delete(id);
        model.addAttribute(delCol);

        return "";
    }
}
