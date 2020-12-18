package com.zxf.web.mapper;

import com.zxf.web.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> selByPid(int pdi);
}
