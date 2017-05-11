package com.lvshun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


/**
 * Created by 宝龙 on 2017/4/27.
 */
@Controller
@RequestMapping(value = "/FileUpload")
public class FileUploadController {
    /*@RequestMapping(value = "fileUpload_ajax", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String springUpload(MultipartFile file) throws IllegalStateException, IOException {


        String path = "D:\\workspace\\lvshun\\src\\main\\web\\files\\upload\\" + file.getOriginalFilename();
        //上传
        file.transferTo(new File(path));

        return null;
    }*/
    @RequestMapping(value = "fileUpload_ajax",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String springUpload(HttpServletRequest request) throws IllegalStateException, IOException
    {
       // long startTime=System.currentTimeMillis();
        //将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）

        CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {

            //将request变成多部分request
            MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
            //获取multiRequest 中所有的文件名
            Iterator iter=multiRequest.getFileNames();
            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path="D:\\workspace\\lvshun\\src\\main\\web\\files\\upload\\"+file.getOriginalFilename();
                    //上传
                    file.transferTo(new File(path));
                }
            }
        }
        return "/success";
    }
}

