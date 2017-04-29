package com.lvshun.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by 宝龙 on 2017/4/29.
 */
@Controller
@RequestMapping(value = "/files")
public class uploadcontroller {
    @RequestMapping(value = "/upLoadFile", method = RequestMethod.POST)
    public String upLoadFile(HttpServletRequest request)
            throws IllegalStateException, IOException {
        // @RequestParam("file") MultipartFile file,
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        // 判断 request 是否有文件上传,即多部分请求
        if (multipartResolver.isMultipart(request)) {
            // 转换成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            // 取得request中的所有文件名
            Iterator<String> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                // 取得上传文件
                MultipartFile f = multiRequest.getFile(iter.next());
                if (f != null) {
                    // 取得当前上传文件的文件名称
                    String myFileName = f.getOriginalFilename();
                    // 如果名称不为“”,说明该文件存在，否则说明该文件不存在
                    if (myFileName.trim() != "") {
                        // 定义上传路径
                        String path = "D:\\workspace\\lvshun\\src\\main\\web\\files\\upload\\"
                                + myFileName;
                        File localFile = new File(path);
                        f.transferTo(localFile);

                    }
                }
            }
        }

        return "{'TFMark':'true','Msg':'upload success !'}";
    }

}
