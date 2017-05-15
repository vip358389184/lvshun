package com.lvshun.server.impl;

import com.lvshun.dao.CommodityDao;
import com.lvshun.po.Commodity;
import com.lvshun.server.CommodityServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Service
public class CommodityServerImpl implements CommodityServer {
    @Autowired
    private CommodityDao commodityDao;


    public int addComm(Commodity commodity) {
        return commodityDao.addComm(commodity);
    }

    public List<Commodity> findAll() {

        return commodityDao.findAll();
    }

    public Commodity findById(String id) {
        return commodityDao.findById(id);
    }

    public int delete(String id) {
        return commodityDao.delete(id);
    }


    public int update(Commodity commodity) {
       return commodityDao.update(commodity);
    }
}
