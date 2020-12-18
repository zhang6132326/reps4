package com.zxf.dao;
import com.zxf.domain.City;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CityDao {
    public List<City> findAll(){
        List<City> cities=new ArrayList<>();
        cities.add(new City(1,"zhang"));
        cities.add(new City(2,"li"));
        cities.add(new City(3,"zhao"));
        cities.add(new City(4,"yang"));
        cities.add(new City(5,"吗"));
        cities.add(new City(6,"插卡"));
        cities.add(new City(7,"显卡"));
        cities.add(new City(8,"我现在"));
        return cities;
    }
}
