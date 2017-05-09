package com.lvshun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;


/**
 * Created by 宝龙 on 2017/4/27.
 */
@Controller
@RequestMapping(value = "/FileUpload")
public class FileUploadController {
    @RequestMapping(value = "fileUpload_ajax", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String springUpload(MultipartFile file) throws IllegalStateException, IOException {


        String path = "D:\\workspace\\lvshun\\src\\main\\web\\files\\upload\\" + file.getOriginalFilename();
        //上传
        file.transferTo(new File(path));
        return null;
    }
}

