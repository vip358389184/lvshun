package com.lvshun.controller;

import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.Commodity;
import com.lvshun.po.OrderList;
import com.lvshun.po.Users;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.Commoditys;
import com.lvshun.vo.OrderLists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
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
    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());

    @ResponseBody
    @RequestMapping(value="/getAllorder")
    public List<OrderList> getAllorder(){
        List<OrderList> orderList = orderListBiz.getAllorder();
        return  orderList;
    }
    @ResponseBody
    @RequestMapping(value="/addorderList")
    public ReturnMessage addorderList(@RequestBody OrderLists orderLists){

        logger.info(orderLists);
        orderListBiz.addorderList(orderLists);

        return  ReturnMessage.SUCCESS;
    }
}
