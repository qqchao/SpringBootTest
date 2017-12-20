package com.qqchao.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestBean testBean;

    @Autowired
    private TestConstantBean testConstantBean;

    @Value("${test.constant}")
    private String testConstant;
    @Value("${random.uuid}")
    private String uuid;
    @Value("${random.value}")
    private String value;

    @RequestMapping("/test")
    public String index(){
        System.out.println(testBean.getName());
        System.out.println(testConstantBean.getA());
        System.out.println(testConstantBean.getName());
        System.out.println(uuid);
        System.out.println(value);

        return "Hello Boot" + testBean.getWord();
    }
}
