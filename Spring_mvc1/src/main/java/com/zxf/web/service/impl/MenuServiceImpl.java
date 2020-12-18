package com.zxf.web.service.impl;

import com.zxf.web.mapper.MenuMapper;
import com.zxf.web.pojo.Menu;
import com.zxf.web.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
     private MenuMapper menuMapper;
    public List<Menu> show() {
        return  menuMapper.selByPid(0);
    }
}
