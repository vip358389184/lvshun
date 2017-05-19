package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.Commodity;
import com.lvshun.util.FileNameUtil;
import com.lvshun.util.ResponseUtil;
import com.lvshun.util.ReturnMessage;
import com.lvshun.util.UUIDUtil;
import com.lvshun.vo.Commoditys;
import com.lvshun.vo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpSession;
/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/comm")
public class CommodityController {
    @Autowired
    private CommodityBiz commodityBiz;

    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());
    @ResponseBody
    @RequestMapping(value="/findAll")
    public List<Commodity> findAll(){
        List<Commodity> commList = commodityBiz.findAll();
        return  commList;
    }

    @ResponseBody
    @RequestMapping(value="/findAllByTo")
    public List<Commodity> findAllByTo(){
        List<Commodity> commList = commodityBiz.findAllByTo();
        return  commList;
    }
    @ResponseBody
    @RequestMapping(value="/addComm")
    public ReturnMessage addComm(@RequestBody Commoditys  commoditys){
        logger.error(commoditys.getPicture());
        commoditys.setCommodity_id(UUIDUtil.getUUID());
        commodityBiz.addComm(commoditys);

        return  ReturnMessage.SUCCESS;
    }

    /**
     * 删除用户
     * @param request
     * @param model
     *
     */
    @ResponseBody
    @RequestMapping("/delete")
    public String delete( HttpServletRequest request,Model model)throws Exception{
        String id= request.getParameter("id");

        int delCol = commodityBiz.delete(id);
        model.addAttribute(delCol);

        return "";
    }
//按ID查询

    @ResponseBody
    @RequestMapping(value = "/findById")
    public Commodity findById(HttpServletRequest request){
        String id=request.getParameter("id");
        Commodity commList = commodityBiz.findById(id);
        return  commList;
    }
    //修改
    @ResponseBody
    @RequestMapping("/update")
    public String update(HttpServletRequest request,Commodity commoditys){

        commodityBiz.update(commoditys);
        return "";
    }

}
