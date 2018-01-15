package com.qqchao.demo.page.service.impl;

import com.github.pagehelper.PageHelper;
import com.qqchao.demo.page.dao.IPageDao;
import com.qqchao.demo.page.domain.PageInfo;
import com.qqchao.demo.page.service.IPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageServiceImpl implements IPageService{
    @Autowired
    private IPageDao iPageDao;

    @Override
    public List<PageInfo> getList(int startPage, int numOnePage) {
        PageHelper.startPage(startPage,numOnePage);

        return iPageDao.getList();
    }
}
