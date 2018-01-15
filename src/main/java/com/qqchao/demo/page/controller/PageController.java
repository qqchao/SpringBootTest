package com.qqchao.demo.page.controller;

import com.qqchao.demo.page.domain.PageInfo;
import com.qqchao.demo.page.service.IPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PageController {
    @Autowired
    private IPageService iPageService;

    @RequestMapping("/getList")
    public List<PageInfo> getList(int startPage, int numOnePage){
        return iPageService.getList(startPage, numOnePage);
    }
}
