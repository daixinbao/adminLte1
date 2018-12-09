package com.xinbao.mmbiz.sys.controller;

import com.xinbao.mmbiz.sys.service.SysUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserInfoController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/getAllUser")
    public Object getAllUser(@Param("pageNum")int pageNum, @Param("pageSize") int pageSize){
        return  sysUserService.getAllUser(pageNum,pageSize);
    }
}
