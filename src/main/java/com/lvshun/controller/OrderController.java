package com.lvshun.controller;

import com.lvshun.vo.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthew on 17/5/5.
 */
@Controller
@RequestMapping("/order")
public class OrderController {


    @RequestMapping("/getOrder")
    public @ResponseBody
    List<Order> contactUs(){
        List<Order> list=new ArrayList();
        Order order=new Order();
        order.setUuid("11111");
        order.setOrderAmt("1231");
        list.add(order);
        return list;
    }
}
