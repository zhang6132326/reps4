package com.zxf.utils;

import java.util.Date;

public class JsonData2 {
    private int code;
    private Object data;
    private String msg;
    private Date date;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public JsonData2(int code, Object data) {
        this.code = code;
        this.data = data;
    }


    public JsonData2() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static JsonData2 buildSuccess(Object data){
        return new JsonData2(1,data);
    }
}
