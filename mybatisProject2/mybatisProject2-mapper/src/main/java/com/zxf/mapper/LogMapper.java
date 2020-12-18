package com.zxf.mapper;

import com.zxf.pojo.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    List<Log> selAll();
    /**
     * mybatis把参数转换为map了,其中@Param("key") 参数内容就是map的value
     * @param accin123
     * @param accout3454235
     * @return
     */
    List<Log> selByAccInAccount(@Param("accin") String accin,@Param("accout") String accout);
    List<Log> selByAccinAccout2(@Param("accout")String accout,@Param("accin") String accin);
    List<Log> selByAccinAccout3(@Param("accout")String accout,@Param("accin") String accin);
    List<Log> selByAccinAccout4(@Param("accout")String accout,@Param("accin") String accin);
    int upd1(Log log);
    List<Log> selByLog(Log log);




}
