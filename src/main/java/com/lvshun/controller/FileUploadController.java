package com.lvshun.controller;

import com.lvshun.util.Files_Helper_DG;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;


/**
 * Created by 宝龙 on 2017/4/27.
 */
@Controller
@RequestMapping(value = "/FileUpload")
public class FileUploadController {
    /*
     *
     * 采用 fileUpload_ajax ， file.transferTo 来保存上传的文件 异步
     */
    @RequestMapping(value = "fileUpload_ajax",method = RequestMethod.POST,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String fileUpload_ajax(HttpServletRequest request, @RequestParam("file_AjaxFile") MultipartFile  multipartFile) {
        //调用保存文件的帮助类进行保存文件，并返回文件的相对路径
        String filePath = Files_Helper_DG.FilesUpload_transferTo_spring(request, multipartFile, "/files/upload");
        return "{'TFMark':'true','Msg':'upload success !','filePath':'" + filePath + "'}";
    }
   }