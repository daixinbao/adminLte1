package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysOrgan;
import java.util.List;

public interface SysOrganMapper {

    int deleteByPrimaryKey(String id);


    int insert(SysOrgan record);


    SysOrgan selectByPrimaryKey(String id);


    List<SysOrgan> selectAll();


    int updateByPrimaryKey(SysOrgan record);
}