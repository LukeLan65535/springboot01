package com.luke.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luke.pojo.Shop;
import com.luke.vo.DataR;

import java.util.List;

/**
 * author：LukeLan
 * date：2022/9/29
 * description：
 **/
public interface ShopService extends IService<Shop> {
    DataR getAllInfo();
    DataR updateInfo(Shop shop);
    DataR deleteInfo(int id);
    DataR addInfo(Shop shop);
}
