package com.luke.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * author：LukeLan
 * date：2022/9/29
 * description：
 **/
@Data
public class Shop implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String status;
    private String descd;
    private Integer deleted;


}
