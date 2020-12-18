package com.zxf.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.zxf.dao.CityDao;
import com.zxf.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {
    @Autowired
    CityDao cityDao;
    public List<City> findAll(){
        List<City> all = cityDao.findAll();
        return all;
    }

}
