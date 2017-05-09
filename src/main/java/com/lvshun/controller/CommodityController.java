package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.po.Commodity;
import com.lvshun.po.Users;
import com.lvshun.util.ResponseUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/comm")
public class CommodityController {
    @Autowired
    private CommodityBiz commodityBiz;
    @ResponseBody
    @RequestMapping(value="/findAll")
    public List<Commodity> findAll(){
        List<Commodity> commList = commodityBiz.findAll();
        return  commList;
    }
}
