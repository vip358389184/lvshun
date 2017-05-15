package com.lvshun.controller;

import com.lvshun.biz.CommodityBiz;
import com.lvshun.biz.OrderListBiz;
import com.lvshun.po.Commodity;
import com.lvshun.util.FileNameUtil;
import com.lvshun.util.ResponseUtil;
import com.lvshun.util.ReturnMessage;
import com.lvshun.vo.Commoditys;
import com.lvshun.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import javax.servlet.http.HttpSession;
/**
 * Created by 宝龙 on 2017/4/20.
 */
@Controller
@RequestMapping("/comm")
public class CommodityController {
    @Autowired
    private CommodityBiz commodityBiz;

    private static Logger logger = LogManager
            .getLogger(UserController.class.getName());
    @ResponseBody
    @RequestMapping(value="/findAll")
    public List<Commodity> findAll(){
        List<Commodity> commList = commodityBiz.findAll();
        return  commList;
    }
    @ResponseBody
    @RequestMapping(value="/addComm")
    public ReturnMessage addComm(@RequestBody Commoditys  commoditys){

        logger.info(commoditys);
        commodityBiz.addComm(commoditys);

        return  ReturnMessage.SUCCESS;
    }

     /**
     * 删除用户
     * @param request
     * @param model
     *
     */
     @ResponseBody
    @RequestMapping("/delete")
        public String delete( HttpServletRequest request,Model model)throws Exception{
       String id= request.getParameter("id");

            int delCol = commodityBiz.delete(id);
            model.addAttribute(delCol);

        return "";
    }
//按ID查询

    @ResponseBody
    @RequestMapping(value = "/findById")
    public Commodity findById(HttpServletRequest request){
        String id=request.getParameter("id");
        Commodity commList = commodityBiz.findById(id);
        return  commList;
    }
//修改
@ResponseBody
@RequestMapping("/update")
 public String update(HttpServletRequest request,Commodity commoditys){

        commodityBiz.update(commoditys);
        return "";
 }
 //添加图片
 @RequestMapping("/updateIcon")
 @ResponseBody
 public String updateIcon(@RequestParam(value = "file", required = false) MultipartFile file, String id, HttpServletRequest request){
     String reply="";
     if(file.getSize()==0){
         return "no file";
     }
     String path=request.getSession().getServletContext().getRealPath("upload");
     //获取上传文件的名字
//		String oriFileName = file.getOriginalFilename();
     //重新起名
     String fileName = FileNameUtil.getName()+".jpg";
//		String requestUrl = request.getRequestURL().toString();
//		String location = requestUrl.substring(0, requestUrl.indexOf("aps"));
     try {
         if("success".equals(reply)){
             File targetFile = new File(path, fileName);
             if(!targetFile.exists()){
                 targetFile.mkdirs();
             }

             //保存
             try {
                 file.transferTo(targetFile);
                 reply="success";
             } catch (Exception e) {
                 e.printStackTrace();
             }
         }
         //			add.setName(new String(add.getName().getBytes("ISO-8859-1"), "utf-8"));

     } catch (Exception e) {
         e.printStackTrace();
         reply="更新信息失败！具体异常信息：" + e.getMessage();
     } finally {
         return reply;
     }
 }

}
