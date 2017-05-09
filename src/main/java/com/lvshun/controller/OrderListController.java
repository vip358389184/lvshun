package com.lvshun.controller;

import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.OrderList;
import com.lvshun.po.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/OrderList")
public class OrderListController {
    @Autowired
    private OrderListBiz orderListBiz;

    @ResponseBody
    @RequestMapping(value="/getAllorder")
    public List<OrderList> getAllorder(){
        List<OrderList> orderList = orderListBiz.getAllorder();
        return  orderList;
    }
    @RequestMapping("/addOrderList")
    public @ResponseBody
    void addOrderList( OrderList orderList){
        orderListBiz.addorderList(orderList);
    }
    @RequestMapping("/delOrderList")
    public @ResponseBody
    void  deleteOrderList(String  id){
       orderListBiz.deleteOrder(id);
    }
    @RequestMapping("/updateOrderList")
    public @ResponseBody
    void updateOrderList(OrderList orderList){
       orderListBiz.updateOrder(orderList);
    }
}
