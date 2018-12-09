package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysUserOrgan;
import java.util.List;

public interface SysUserOrganMapper {

    int deleteByPrimaryKey(String id);


    int insert(SysUserOrgan record);


    SysUserOrgan selectByPrimaryKey(String id);


    List<SysUserOrgan> selectAll();


    int updateByPrimaryKey(SysUserOrgan record);
}