package com.lvshun.controller;

import com.lvshun.biz.UserBiz;
import com.lvshun.po.PageBean;
import com.lvshun.po.Users;
import com.lvshun.util.ResponseUtil;
import com.lvshun.util.StringUtil;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by baolong on 2017/4/19.
 */
@Controller
@RequestMapping("/user" )
public class UserController  {
    @Autowired
    private UserBiz userBiz;
    @ResponseBody
    @RequestMapping(value = "/delete" ,method = RequestMethod.POST)
    public String delete(@RequestParam(value="ids") String ids, HttpServletResponse res) throws Exception{
        String[] idStr = ids.split(",");
        JSONObject jsonObject = new JSONObject();
        for (String id : idStr) {
            userBiz.delete(id);
        }
        jsonObject.put("success", true);
        ResponseUtil.write(res, jsonObject);
        return null;
    }
    /**
     * 添加或者修改
     * @param user
     * @param res
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(Users user, HttpServletResponse res,HttpServletRequest req,@RequestParam("userid")String userid,@RequestParam("username")String username,@RequestParam("password")String password) throws Exception{
        //操作记录条数，初始化为0
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        int resultTotal = 0;
        if (user.getUserId() == null) {
            resultTotal = userBiz.addUser(userid,username,password);
        }else{
            resultTotal = userBiz.update(user);
        }
        JSONObject jsonObject = new JSONObject();
        if(resultTotal > 0){   //说明修改或添加成功
            jsonObject.put("success", true);
        }else{
            jsonObject.put("success", false);
        }
        ResponseUtil.write(res, jsonObject);
        return null;
    }


    @ResponseBody
    @RequestMapping(value="findAll",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public String list(Users s_user,HttpServletRequest req) throws Exception{
        List<Users> userList =userBiz.findAll();
        JSONArray json = new JSONArray();
        for(Users user : userList){
            JSONObject jo = new JSONObject();
            jo.put("id",user.getUserId());
            jo.put("name",user.getUserName());
            jo.put("password",user.getPassword());
            json.put(jo);
        }
        return json.toString();
    }
    @RequestMapping(value = "/getbyid")
    public String cx(@RequestParam(value="userid") String userid,HttpServletRequest req ,HttpServletResponse rep) throws Exception{

        Users user= userBiz.getById(userid);
        HttpSession session = req.getSession();
        session.setAttribute("user",user);

        return null;

    }

}
