package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.po.Commodity;
import com.lvshun.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/Commodity")
public class CommodityController {
    @Autowired
    private CommodityBiz commodityBiz;
    @ResponseBody
    @RequestMapping(value = "/delete" ,method = RequestMethod.POST)
    public String delete(@RequestParam(value="ids") String ids, HttpServletResponse res) throws Exception{
        String[] idStr = ids.split(",");
        JSONObject jsonObject = new JSONObject();
        for (String id : idStr) {
            commodityBiz.delete(id);
        }
        jsonObject.put("success", true);
        ResponseUtil.write(res, jsonObject);
        return null;
    }
    /**
     * 添加或者修改
     * @param
     * @param res
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/addComm")
    public String addUser(Commodity commodity, HttpServletResponse res, HttpServletRequest req, @RequestParam("cid")String cid, @RequestParam("cname")String cname, @RequestParam("cdate")String cdate) throws Exception{
        //操作记录条数，初始化为0
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        int resultTotal = 0;
        if (commodity.getcId() == null) {
            resultTotal = commodityBiz.addComm(cid,cname,cdate);
        }else{
            resultTotal = commodityBiz.update(commodity);
        }
        JSONObject jsonObject = new JSONObject();
        if(resultTotal > 0){   //说明修改或添加成功
            jsonObject.put("success", true);
        }else{
            jsonObject.put("success", false);
        }
        ResponseUtil.write(res, jsonObject);
        return null;
    }


    @ResponseBody
    @RequestMapping(value="findAll",method= RequestMethod.POST,produces="text/html;charset=UTF-8")
    public String list(Commodity commodity,HttpServletRequest req) throws Exception{
        List<Commodity> commodityList =commodityBiz.findAll();
        JSONArray json = new JSONArray();
        for(Commodity  commodity1 : commodityList){
            JSONObject jo = new JSONObject();
            jo.put("cid",commodity1.getcId());
            jo.put("cname",commodity1.getcName());
            jo.put("cdate",commodity1.getcDate());
            json.put(jo);
        }
        return json.toString();
    }
    @RequestMapping(value = "/getbyid")
    public String cx(@RequestParam(value="cid") String cid,HttpServletRequest req ,HttpServletResponse rep) throws Exception{
        Commodity commodity = commodityBiz.getById(cid);
        HttpSession session = req.getSession();
        session.setAttribute("commdity",commodity);
        return null;

    }

}
