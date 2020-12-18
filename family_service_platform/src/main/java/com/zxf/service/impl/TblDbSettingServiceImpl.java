package com.zxf.service.impl;

import com.zxf.bean.TblDbSetting;
import com.zxf.mapper.TblDbSettingMapper;
import com.zxf.service.TblDbSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库设置; InnoDB free: 8192 kB 服务实现类
 * </p>
 *
 * @author zxf
 * @since 2020-09-19
 */
@Service
public class TblDbSettingServiceImpl extends ServiceImpl<TblDbSettingMapper, TblDbSetting> implements TblDbSettingService {

}
