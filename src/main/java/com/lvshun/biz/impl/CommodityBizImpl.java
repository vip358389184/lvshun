package com.lvshun.biz.impl;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.po.Commodity;
import com.lvshun.server.CommodityServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Service
public class CommodityBizImpl implements CommodityBiz{
    @Autowired
    private CommodityServer commodityServer;

    public void addComm(Commodity commodity) {
        Commodity commodity1 = new Commodity();
        commodityServer.addComm(commodity1);
    }

    public List<Commodity> findAll() {
        Commodity commodity = new Commodity();
        return commodityServer.findAll();
    }

    public Commodity getById(String  id) {
        Commodity commodity = new Commodity();

        return  commodityServer.getById(commodity.getcId());
    }

    public void delete(String id) {
        Commodity commodity = new Commodity();
        commodityServer.delete(commodity.getcId());
    }

    public void update(Commodity commodity) {
        Commodity commodity1 = new Commodity();
        commodityServer.update(commodity1);
    }
}
