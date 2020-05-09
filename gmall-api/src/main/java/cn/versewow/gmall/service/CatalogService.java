package cn.versewow.gmall.service;

import cn.versewow.gmall.bean.PmsBaseCatalog1;
import cn.versewow.gmall.bean.PmsBaseCatalog2;
import cn.versewow.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1);

    List<PmsBaseCatalog3> getCatalog3(String catalog2);
}
