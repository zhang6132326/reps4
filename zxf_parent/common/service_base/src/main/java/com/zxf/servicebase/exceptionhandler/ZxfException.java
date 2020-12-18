package com.zxf.servicebase.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //有参数的构造方法
@NoArgsConstructor   //无参数构造方法
public class ZxfException extends RuntimeException {
    private Integer code; //状态码
    private String msg; //异常信息

}
