package com.lvshun.controller;
import com.lvshun.biz.UserBiz;
import com.lvshun.po.Commodity;
import com.lvshun.po.Users;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;
/**
 * Created by baolong on 2017/4/19.
 */
@Controller
@RequestMapping("/user" )
public class UserController {
    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());
    @Autowired
    private UserBiz userBiz;
    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<Users> findAll() {
        List<Users> userList = userBiz.findAll();
        return userList;
    }

    @ResponseBody
    @RequestMapping(value="/addUsers")
    public ReturnMessage addUsers(@RequestBody User user){
        userBiz.addUsers(user);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("statue",1);
        return ReturnMessage.SUCCESS
        ;}

    //删除
    @ResponseBody
    @RequestMapping("/delete")
    public String delete(HttpServletRequest request, Model model) throws Exception {
        String id = request.getParameter("id");
        int delCol = userBiz.delete(id);
        model.addAttribute(delCol);
        return "";
    }

    @ResponseBody
    @RequestMapping(value="/selectlogin")
    public ReturnMessage selectlogin(@RequestBody User user){
        int count = userBiz.selectlogin(user);
        logger.info("count:"+count);
        if(count>0){
            logger.info("登录成功！");
            return  ReturnMessage.SUCCESS;

       }else {
           logger.info("登录失败！");
           return ReturnMessage.ERROR;
       }
    }
    //修改
    @ResponseBody
    @RequestMapping(value="/update")
    public String update(Users users, HttpServletRequest request){
        String user_id=request.getParameter("user_id");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        String phone =request.getParameter("phone");
        String address =request.getParameter("address");
        String integral =request.getParameter("integral");
        String monetary =request.getParameter("monetary");
        userBiz.update(users);
        return  "success";
    }
}
