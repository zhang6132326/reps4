package com.zxf.mapper;

import com.zxf.pojo.Role;

import java.util.List;

public interface RoleMapper {
    public List<Role> finAll();
    //查看用户下的所有权限

    public List<Role> finall_u_r();
}
