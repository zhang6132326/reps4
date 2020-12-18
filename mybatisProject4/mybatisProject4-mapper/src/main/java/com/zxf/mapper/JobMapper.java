package com.zxf.mapper;

import com.zxf.pojo.Job;

public interface JobMapper {
    Job  selectJobById(String job_id);
}
