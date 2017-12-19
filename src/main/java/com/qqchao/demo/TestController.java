package com.qqchao.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestBean testBean;

    @Value("${test.constant}")
    private String testConstant;

    @RequestMapping("/")
    public String index(){
        System.out.println(testBean.getName());

        return "Hello Boot" + testBean.getWord();
    }
}
