package cn.versewow.gmall.manage.controller;

import cn.versewow.gmall.bean.PmsBaseAttrInfo;
import cn.versewow.gmall.bean.PmsBaseAttrValue;
import cn.versewow.gmall.bean.PmsBaseSaleAttr;
import cn.versewow.gmall.service.AttrService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {
    @Reference
    AttrService attrService;

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> list  =  attrService.attrInfoList(catalog3Id);
        return  list;
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public  String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo ){
    String flag = attrService.saveAttrInfo(pmsBaseAttrInfo);

    return  flag;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId){
        return attrService.getAttrValueList(attrId);
    }

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr> list = attrService.baseSaleAttrList();
        return  list;
    }
}
