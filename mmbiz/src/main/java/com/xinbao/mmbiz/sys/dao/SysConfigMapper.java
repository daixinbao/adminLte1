package com.xinbao.mmbiz.sys.dao;

import com.xinbao.mmbiz.sys.entity.SysConfig;
import java.util.List;

public interface SysConfigMapper {

    int insert(SysConfig record);


    List<SysConfig> selectAll();
}