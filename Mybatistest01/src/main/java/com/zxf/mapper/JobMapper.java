package com.zxf.mapper;

import com.zxf.pojo.Job;

import java.util.List;

public interface JobMapper {
    //根据职位ID 查询职位信息
    public Job selectJobById(String job_id);
    /*
         两个表之间的关联查询
         通过员工ID查询出他所有的职位信息。
     */
    public List<Job> selectJobByEmpId(String emp_no);
}
