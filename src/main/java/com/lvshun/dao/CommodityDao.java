package com.lvshun.dao;

import com.lvshun.po.Commodity;
import com.lvshun.po.Users;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/19.
 */
public interface CommodityDao {
    //添加商品
    public void addComm(Commodity commodity);
    //查询全部商品
    public List<Commodity> findAll();
    //查询商品详细
    public Commodity getById(String id);
    //删除商品
    public void delete(String id);
    //修改商品
    public void update(Commodity commodity);
}
