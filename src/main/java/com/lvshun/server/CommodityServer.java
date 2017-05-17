package com.lvshun.server;

import com.lvshun.po.Commodity;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
public interface CommodityServer {
    //添加商品
    public int addComm(Commodity commodity);
    //查询全部商品
    public List<Commodity> findAll();
    //查询商品详细
    public Commodity findById(String id);
    //删除商品
    public int delete(String id);
    //修改商品
    public int update(Commodity commodity);
}
