package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysRoleResource;
import java.util.List;

public interface SysRoleResourceMapper {

    int deleteByPrimaryKey(String id);


    int insert(SysRoleResource record);


    SysRoleResource selectByPrimaryKey(String id);


    List<SysRoleResource> selectAll();


    int updateByPrimaryKey(SysRoleResource record);
}