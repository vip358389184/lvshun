package com.lvshun.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping(value = "fileUpload_ajax",method = RequestMethod.POST)
    @ResponseBody
    public String springUpload(HttpServletRequest request,@RequestParam("file_AjaxFile") MultipartFile file1) throws IllegalStateException, IOException {
        /**
         * 进行判断是否存在文件
         **/
        if (!file1.isEmpty()) {
            /**
             * 设置文件放置路径
             *  根目录下的 upload
             */
            String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"
                    + file1.getOriginalFilename();
            // 转存文件
            //原来为   临时文件 需要转存才可以保存下来
            file1.transferTo(new File(filePath));

/**
 * 数据库 存储地址
 *   "upload/"+ file1.getOriginalFilename();
 *   如未防止 文件名重复 可采用  UUId进行防止
 */
            String dbfilePath = "upload/" + file1.getOriginalFilename();
            return "{data:'"+dbfilePath+"'}";

        }
        return "{'data':fail}";
    }
}

