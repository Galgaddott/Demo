package cn.versewow.gmall.manage.impl;

import cn.versewow.gmall.bean.PmsBaseCatalog1;
import cn.versewow.gmall.bean.PmsBaseCatalog2;
import cn.versewow.gmall.bean.PmsBaseCatalog3;
import cn.versewow.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import cn.versewow.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import cn.versewow.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import cn.versewow.gmall.service.CatalogService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {

        return pmsBaseCatalog1Mapper.selectAll();
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(String catalog1) {
        PmsBaseCatalog2 p2 = new PmsBaseCatalog2();
        p2.setCatalog1Id(catalog1);
        return pmsBaseCatalog2Mapper.select(p2);
    }

    public List<PmsBaseCatalog3> getCatalog3(String catalog2) {

        PmsBaseCatalog3 p3 = new PmsBaseCatalog3();
        p3.setCatalog2Id(catalog2);
        return pmsBaseCatalog3Mapper.select(p3);
    }
}
