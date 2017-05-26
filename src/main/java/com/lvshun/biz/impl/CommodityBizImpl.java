package com.lvshun.biz.impl;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.po.Commodity;
import com.lvshun.server.CommodityServer;
import com.lvshun.vo.Commoditys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Service
public class CommodityBizImpl implements CommodityBiz   {
    @Autowired
    private CommodityServer commodityServer;

    public int addComm(Commoditys commodity) {
        Commodity commodity1 = new Commodity();
        commodity1.setC_id(commodity.getC_id());
        commodity1.setC_name(commodity.getC_name());
        commodity1.setBrand(commodity.getBrand());
        commodity1.setBroad_heading(commodity.getBroad_heading());
        commodity1.setLabel(commodity.getLabel());
        commodity1.setIntroduce(commodity.getIntroduce());
        commodity1.setC_state(commodity.getC_state());
        commodity1.setInventory(commodity.getInventory());
        commodity1.setNormal_price(commodity.getNormal_price());
        commodity1.setRetail_price(commodity.getRetail_price());
        commodity1.setProperty(commodity.getProperty());
        commodity1.setSubclass(commodity.getSubclass());
        commodity1.setCdate(commodity.getCdate());
        commodity1.setPicture(commodity.getPicture());
       return commodityServer.addComm(commodity1);
    }

    public List<Commodity> findAll() {

        return commodityServer.findAll();
    }

    public List<Commodity> findAllByTo(){
        return  commodityServer.findAllByTo();
    }

    public Commodity findById(String  id) {

        return  commodityServer.findById(id);
    }

    public int delete(String id) {

     return  commodityServer.delete(id);
    }

    public int update(Commodity commodity) {

        return commodityServer.update(commodity);
    }

}
