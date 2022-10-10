package com.luke.controller;

import com.luke.pojo.Shop;
import com.luke.service.ShopService;
import com.luke.vo.DataR;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * author：LukeLan
 * date：2022/9/29
 * description：
 **/
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @GetMapping
    public DataR getAllInfo(){
        return shopService.getAllInfo();
    }
    @PostMapping
    public DataR addInfo(@RequestBody Shop shop){
        return shopService.addInfo(shop);
    }
    @PutMapping
    public DataR updateInfo(@RequestBody Shop shop){
        return  shopService.updateInfo(shop);
    }
    @DeleteMapping
    public DataR deleteInfo(@Param("id")int id){
        return shopService.deleteInfo(id);
    }
}
