package cn.versewow.gmall.manage.controller;

import cn.versewow.gmall.bean.PmsProductInfo;
import cn.versewow.gmall.manage.util.PmsUploadUtil;
import cn.versewow.gmall.service.SpuService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {
    @Reference
    SpuService spuService;


    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
         System.out.println(catalog3Id);
        List<PmsProductInfo> list = spuService.supList(catalog3Id);
        return list;

    }

    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo info){

        return "success";
    }


    @RequestMapping("fileUpload")
    @ResponseBody
    public  String fileUpload(@RequestParam("file") MultipartFile multipartFile){
    //将图片上传到分布式文件系统
        String imageUrl = PmsUploadUtil.uoloadImage(multipartFile);

        return imageUrl;
    }


}
