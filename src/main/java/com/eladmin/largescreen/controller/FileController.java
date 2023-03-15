package com.eladmin.largescreen.controller;


import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;

import com.eladmin.largescreen.entity.FileDAO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-03-14
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @Value("${files.upload.path}")
    private String fileUploadPath;

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws IOException {
//        获取传过来的文件相关信息
        String originalFileName = file.getOriginalFilename();
        String type = FileUtil.extName(originalFileName);
        long size = file.getSize();
//        将文件写入磁盘: 判断写入的磁盘目录是否存在; 如果不存在，则创建
        File uploadParentFile = new File(fileUploadPath);
        if (!uploadParentFile.exists()) {
            uploadParentFile.mkdirs();
        }
//        给文件起一个唯一的名字（标识符）
        String uuid = IdUtil.fastSimpleUUID();
        File uploadFile = new File(fileUploadPath + uuid + StrUtil.DOT + type);
//        将获取到的文件写入磁盘目录中
        file.transferTo(uploadFile);

        FileDAO fileDAO = new FileDAO();


        return "";

    }

}

