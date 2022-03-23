package com.sixth.service;

import com.sixth.Dao.LoginDao;
import com.sixth.domain.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private LoginDao loginDao;
    public boolean login(login login){
       login =  loginDao.login(login);
       if(login!=null){
           return  true;
       }else {
           return  false;
       }
    }
}
