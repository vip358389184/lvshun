package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.po.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/Commodity")
public class CommodityController {
    @Autowired
    private CommodityBiz commodityBiz;
    @RequestMapping("/getAllComm")
    public  @ResponseBody
    List<Commodity> getAll(){

        return commodityBiz.findAll();
    }
    @RequestMapping("/addComm")
    public @ResponseBody
    void addComm( Commodity commodity){
        commodityBiz.addComm(commodity);
    }
    @RequestMapping("/delComm")
    public @ResponseBody
    void  delComm(String  id){
        commodityBiz.delete(id);
    }
    @RequestMapping("/updateComm")
    public @ResponseBody
    void updateComm(Commodity commodity){
        commodityBiz.update(commodity);
    }
}
