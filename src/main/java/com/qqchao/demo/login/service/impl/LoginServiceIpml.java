package com.qqchao.demo.login.service.impl;

import com.qqchao.demo.login.dao.LoginMapper;
import com.qqchao.demo.login.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceIpml implements ILoginService{
    @Autowired
    LoginMapper loginMapper;

    @Override
    public boolean login(String name, String pass) {
        boolean result = loginMapper.login(name, pass)>0;
        return result;
    }
}
