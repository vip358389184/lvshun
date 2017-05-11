package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.Commodity;
import com.lvshun.util.ResponseUtil;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.Commoditys;
import com.lvshun.vo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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
    @RequestMapping(value="/addComm")
    public ReturnMessage addComm(@RequestBody Commoditys  commoditys){

        logger.info(commoditys);
        commodityBiz.addComm(commoditys);

        return  ReturnMessage.SUCCESS;
    }
}
