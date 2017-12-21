package com.qqchao.demo.login.controller;

import com.qqchao.demo.login.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/login")
    @ResponseBody
    public void login(String user, String pass){
        boolean result = iLoginService.login(user, pass);

        System.out.println(result);
    }

}
