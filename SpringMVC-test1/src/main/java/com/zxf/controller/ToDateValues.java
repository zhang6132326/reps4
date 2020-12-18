package com.zxf.controller;
import org.springframework.core.convert.converter.Converter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToDateValues implements Converter<String,Date> {
    public Date convert(String s){
        if(s==null){
            throw new RuntimeException("什么都没有啊");
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try{
            return sdf.parse(s);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
