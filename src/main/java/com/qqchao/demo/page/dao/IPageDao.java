package com.qqchao.demo.page.dao;

import com.qqchao.demo.page.domain.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IPageDao {
    public List<PageInfo> getList();
}
