package com.xinbao.mmbiz.sys.service;

import com.github.pagehelper.PageHelper;
import com.xinbao.mmbiz.sys.dao.SysUserMapper;
import com.xinbao.mmbiz.sys.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;
    public List<SysUser> getAllUser(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return sysUserMapper.selectAll();
    }
}
