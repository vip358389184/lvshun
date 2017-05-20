package com.lvshun.controller;

import com.lvshun.biz.AddFormBiz;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.Addfro;
import com.lvshun.vo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/5/19.
 */


@Controller
@RequestMapping("/Form" )
public class AddFromController {

    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());

    @Autowired
    private AddFormBiz addFormBiz;


    @ResponseBody
    @RequestMapping(value = "/paddfrom")
    public ReturnMessage paddfrom(@RequestBody Addfro addfro) {
        addFormBiz.paddfrom(addfro);
/*
        logger.info(addfro);

        return ReturnMessage.SUCCESS;*/
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("statue",1);
        return ReturnMessage.SUCCESS;}



}
