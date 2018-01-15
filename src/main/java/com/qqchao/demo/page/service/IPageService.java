package com.qqchao.demo.page.service;

import com.qqchao.demo.page.domain.PageInfo;

import java.util.List;

public interface IPageService {
    public List<PageInfo> getList(int startPage, int numOnePage);
}
