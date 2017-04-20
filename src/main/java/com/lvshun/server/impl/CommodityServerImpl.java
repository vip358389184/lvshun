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

    public void addComm(Commodity commodity) {
        commodityDao.addComm(commodity);
    }

    public List<Commodity> findAll() {
        List<Commodity> list = commodityDao.findAll();
        return list;
    }

    public Commodity getById(String id) {
        return commodityDao.getById(id);
    }

    public void delete(String id) {
         commodityDao.delete(id);
    }

    public void update(Commodity commodity) {
        commodityDao.update(commodity);
    }
}
