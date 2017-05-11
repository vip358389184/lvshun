package com.lvshun.biz;

import com.lvshun.po.OrderList;
import com.lvshun.vo.OrderLists;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
public interface OrderListBiz {
    //添加订单
    public int addorderList(OrderLists orderList);
    //查询订单
    public List<OrderList> getAllorder();
    //查询订单详细
    public OrderList getByoId(String id);
    //删除订单
    public int deleteOrder(String id);
    //修改订单
    public int updateOrder(OrderLists orderList);
}
