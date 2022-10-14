package com.luke.vo;

import lombok.Data;

/**
 * author：LukeLan
 * date：2022/9/29
 * description：
 **/
@Data
public class DataR {
    private int code;
    private String msg;
    private Object data;

    public DataR(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DataR(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public DataR(Object data) {
        this.data = data;
    }

    public DataR(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }
}
