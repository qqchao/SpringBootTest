package com.qqchao.demo.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {
    int login(@Param("name") String name, @Param("pass") String pass);
}
