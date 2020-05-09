package cn.versewow.gmall.manage.impl;

import cn.versewow.gmall.bean.PmsProductInfo;
import cn.versewow.gmall.manage.mapper.PmsProductInfoMapper;
import cn.versewow.gmall.service.SpuService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> supList(String catalog3Id) {
        PmsProductInfo item = new PmsProductInfo();
        item.setCatalog3Id(catalog3Id);
        return pmsProductInfoMapper.select(item);
    }

}
