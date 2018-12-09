package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {

    int deleteByPrimaryKey(String id);


    int insert(SysUserRole record);


    SysUserRole selectByPrimaryKey(String id);


    List<SysUserRole> selectAll();


    int updateByPrimaryKey(SysUserRole record);
}