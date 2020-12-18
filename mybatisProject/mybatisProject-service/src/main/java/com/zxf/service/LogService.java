package com.zxf.service;

import com.zxf.pojo.PageInfo;

import java.io.IOException;

public interface LogService {
    public PageInfo showPage(int pageSize, int pageNumber) throws IOException;
}
