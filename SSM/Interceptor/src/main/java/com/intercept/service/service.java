package com.intercept.service;

import com.intercept.Dao.LoginDao;
import com.intercept.domain.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class service {
    LoginDao loginDao;
    public boolean login(login login){
        login l = loginDao.login(login);
        if (l!=null){
            return true;
        }else {
            return false;
        }
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
