package cn.versewow.gmall.service;

import cn.versewow.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> supList(String catalog3Id);
}
