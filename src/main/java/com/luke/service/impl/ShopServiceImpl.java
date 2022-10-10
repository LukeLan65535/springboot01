package com.luke.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luke.mapper.ShopMapper;
import com.luke.pojo.Shop;
import com.luke.service.ShopService;
import com.luke.vo.DataR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * author：LukeLan
 * date：2022/9/29
 * description：
 **/
@Service
public class ShopServiceImpl extends ServiceImpl<ShopMapper, Shop> implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public DataR getAllInfo() {
        List<Shop> list = shopMapper.selectList(Wrappers.lambdaQuery());
        return new DataR(list);
    }

    @Override
    public DataR updateInfo(Shop shop) {
        shopMapper.updateById(shop);
        return new DataR("success!");
    }

    @Override
    public DataR deleteInfo(int id) {
        shopMapper.deleteById(id);
        return new DataR("success!");
    }

    @Override
    public DataR addInfo(Shop shop) {
        shopMapper.insert(shop);
        return new DataR("success!");
    }
}
