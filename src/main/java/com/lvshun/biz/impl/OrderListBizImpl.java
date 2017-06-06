package com.lvshun.biz.impl;

import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.OrderList;
import com.lvshun.server.OrderListServer;
import com.lvshun.vo.OrderLists;
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
    public int addorderList(OrderLists orderList) {
        OrderList orderList1 = new OrderList();
        orderList1.setC_id(orderList.getC_id());
        orderList1.setO_id(orderList.getO_id());
        orderList1.setO_name(orderList.getO_name());
        orderList1.setAddress(orderList.getAddress());
        orderList1.setC_number(orderList.getC_number());
        orderList1.setDelivery_costs(orderList.getDelivery_costs());
        orderList1.setMoney(orderList.getMoney());
        orderList1.setO_property(orderList.getO_property());
        orderList1.setO_state(orderList.getO_state());
        orderList1.setPopay_ment(orderList.getPopay_ment());
        orderList1.setOfk_date(orderList.getOfk_date());
        orderList1.setOrder_time(orderList.getOrder_time());
        orderList1.setOsh_date(orderList.getOsh_date());
        orderList1.setOsong_date(orderList.getOsong_date());
        orderList1.setS_method(orderList.getS_method());
        orderList1.setPresent_exp(orderList.getPresent_exp());
        orderList1.setOxd_date(orderList.getOxd_date());
        orderList1.setUser_id(orderList.getUser_id());
        orderList1.setUsername(orderList.getUsername());
        orderList1.setPhone(orderList.getPhone());
        orderList1.setDawk(orderList.getDawk());
        orderList1.setPrefecture(orderList.getPrefecture());
        orderList1.setAddress(orderList.getAddress());
        return orderListServer.addorderList(orderList1);
    }

    public List<OrderList> getAllorder() {
        OrderList orderList = new OrderList();

        return orderListServer.getAllorder();
    }

    public OrderList getByoId(String id) {
        OrderList orderList = new OrderList();

        return orderListServer.getByoId(orderList.getO_id());
    }

    public int deleteOrder(String id) {
       return 0;
    }

    public int updateOrder(OrderLists orderList) {
       return 0;
    }
}
