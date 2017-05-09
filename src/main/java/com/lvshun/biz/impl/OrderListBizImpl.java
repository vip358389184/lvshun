package com.lvshun.biz.impl;

import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.OrderList;
import com.lvshun.server.OrderListServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Service
public class OrderListBizImpl implements OrderListBiz {
    @Autowired
    private OrderListServer  orderListServer;
    public void addorderList(OrderList orderList) {
        OrderList orderList1 = new OrderList();
        orderListServer.addorderList(orderList1);
    }

    public List<OrderList> getAllorder() {
        OrderList orderList = new OrderList();

        return orderListServer.getAllorder();
    }

    public OrderList getByoId(String id) {
        OrderList orderList = new OrderList();

        return orderListServer.getByoId(orderList.getO_id());
    }

    public void deleteOrder(String id) {
        OrderList orderList = new OrderList();
        orderListServer.deleteOrder(orderList.getO_id());
    }

    public void updateOrder(OrderList orderList) {
        OrderList orderList1 = new OrderList();
        orderListServer.updateOrder(orderList1);
    }
}
