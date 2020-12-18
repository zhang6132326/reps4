package com.zxf.mapper;

import com.zxf.bean.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户档案; InnoDB free: 8192 kB Mapper 接口
 * </p>
 *
 * @author zxf
 * @since 2020-09-19
 */
@Component
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {

      public TblUserRecord login(@Param("username") String username,@Param("password") String password);


}
