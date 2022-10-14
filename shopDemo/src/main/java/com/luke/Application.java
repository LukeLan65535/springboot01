package com.luke;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author：LukeLan
 * date：2022/9/26
 * description：
 **/
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@MapperScan("com.luke.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
