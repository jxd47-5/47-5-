package com.jxd.studentManage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @ClassName UpdateController
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/11/9
 * @Version 1.0
 */
@Controller
public class UpdateController {
    @RequestMapping(value="imgUpload",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String imgUpload(@RequestParam("file") MultipartFile file) throws IOException {
        //确定文件上传位置
        String path = ClassUtils.getDefaultClassLoader().getResource("").getPath() +"/static";
        //判断文件夹是否存在,如果不存在则创建一个新的
        File file_save = new File(path);
        if (!file_save.exists()){
            //创建目录
            file_save.mkdir();
        }

        //处理文件名,添加UUID,保证每个文件名全局唯一
        //获取原文件名
        String fname_old = file.getOriginalFilename();
        //获取UUID,全局唯一的36为字符串,包含数组字母和-
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        String fname_new = uuid +"_"+ fname_old;

        //保存文件到服务器
        File file_final = new File(path,fname_new);
        //输出过程
        file.transferTo(file_final);
        return fname_new;
    }
}
