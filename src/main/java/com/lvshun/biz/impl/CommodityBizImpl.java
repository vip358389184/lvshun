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

    public int addComm(String cid,String cname,String cdate) {

       return commodityServer.addComm(cid,cname,cdate);
    }

    public List<Commodity> findAll() {

        return commodityServer.findAll();
    }

    public Commodity getById(String  id) {


        return  commodityServer.getById(id);
    }

    public int delete(String id) {

     return  commodityServer.delete(id);
    }

    public int update(Commodity commodity) {
       return  commodityServer.update(commodity);
    }
}
