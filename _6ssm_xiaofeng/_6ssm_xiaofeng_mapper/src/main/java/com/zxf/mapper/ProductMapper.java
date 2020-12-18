package com.zxf.mapper;

import com.zxf.pojo.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    //查询所有的产品信息
    @Select("select * from product")
    public List<Product> findAll() throws Exception;
}
