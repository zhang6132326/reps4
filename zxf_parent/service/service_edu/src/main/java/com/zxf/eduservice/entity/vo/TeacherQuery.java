package com.zxf.eduservice.entity.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TeacherQuery {
    @ApiModelProperty(value = "讲师名称，模糊查询")
    private String name;
    @ApiModelProperty(value = "头衔1高级 2首席")
    private Integer level;
    @ApiModelProperty(value = "查询开始时间",example = "1981-05-04 7:2:10")
    private String begin;
    @ApiModelProperty(value = "查询结束时间",example = "1986-05-04 7:2:10")
    private String end;
}
