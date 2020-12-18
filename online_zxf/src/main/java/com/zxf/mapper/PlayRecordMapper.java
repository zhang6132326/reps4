package com.zxf.mapper;

import com.zxf.model.entity.PlayRecord;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayRecordMapper {
    int saveRecord(PlayRecord playRecord);
}
