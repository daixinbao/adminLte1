package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysResource;
import java.util.List;

public interface SysResourceMapper {

    int deleteByPrimaryKey(String id);


    int insert(SysResource record);


    SysResource selectByPrimaryKey(String id);


    List<SysResource> selectAll();


    int updateByPrimaryKey(SysResource record);
}