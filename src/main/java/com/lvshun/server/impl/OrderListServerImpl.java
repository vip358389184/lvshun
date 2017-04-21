package com.lvshun.server.impl;

import com.lvshun.dao.OrderListDao;
import com.lvshun.po.OrderList;
import com.lvshun.server.OrderListServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Service
public class OrderListServerImpl implements OrderListServer {
    @Autowired
     private  OrderListDao orderListDao;

    public void addorderList(OrderList orderList) {
            orderListDao.addorderList(orderList);
    }

    public List<OrderList> getAllorder() {
        return orderListDao.getAllorder();
    }

    public OrderList getByoId(String id) {
        return orderListDao.getByoId(id);
    }

    public void deleteOrder(String id) {
            orderListDao.deleteOrder(id);
    }

    public void updateOrder(OrderList orderList) {
            orderListDao.updateOrder(orderList);
    }
}
