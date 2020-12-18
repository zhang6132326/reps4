package com.zxf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Users1 {

    @TableId(type = IdType.ID_WORKER)
    private Integer userid;

    private String username;
    private Integer userage;
    private String text;
}
