package com.zxf.pojo;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/*
    这就是lombok
     会在运行时候生成set.get方法
     还会有无参 有参的构造函数。

 */
@Data
public class Users {
    /*
       AUTO  自动增长
      ID_WORKER 19位
     */
     @TableId(type = IdType.INPUT)
    private Integer userid;

    private String username;
    private Integer userage;
    private String text;

    @TableField(fill = FieldFill.INSERT)
    private Date create_time;

    @TableField(fill = FieldFill.UPDATE)
    private Date update_time;

    /*
        定义一个版本号的字段，用于乐观锁。
        每次修改该字段做记录的时候，都要对比一下自己拿到的本次version是否为最新版本，如果不是不能完成修改

     */
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    //逻辑删除字段标记
    @TableLogic
    private Integer deleted;

}
