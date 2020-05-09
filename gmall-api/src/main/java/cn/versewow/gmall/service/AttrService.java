package cn.versewow.gmall.service;

import cn.versewow.gmall.bean.PmsBaseAttrInfo;
import cn.versewow.gmall.bean.PmsBaseAttrValue;
import cn.versewow.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);


    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
