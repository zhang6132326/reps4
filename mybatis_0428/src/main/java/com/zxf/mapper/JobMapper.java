package com.zxf.mapper;

import com.zxf.pojo.Job;

import java.util.List;

public interface JobMapper {

    //通过职位和员工关联，完成多对多查询。
    public List<Job> getall_job_emp();

}
