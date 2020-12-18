package com.zxf.exception;
/*
   自定义异常类
 */
public class XFException extends RuntimeException {
    private Integer code;
    private String  msg;
    public XFException(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
