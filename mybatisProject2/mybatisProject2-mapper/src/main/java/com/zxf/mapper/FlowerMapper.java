package com.zxf.mapper;
import com.zxf.pojo.Flower;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;
public interface FlowerMapper {
    //采用了注解的方式
    @Select("select * from flower")
    public List<Flower> getAll();

    public List<Flower> getAll2();

    public int saveFlower(Flower flower);

    public void updateFlower(Flower flower);

    public void delFlower(Integer i);

    public Flower findByidFlower(Integer i);

    public List<Flower> findBylike(@Param("name") String name);

    public int getAllSize();

    public Flower findFlowerByCondition(Flower flower);
    public Flower findFlowerByCondition2(Flower flower);
   // public List<Flower> findFlowin(@Param("lists") List<Integer> lists);


}
