package com.third.service;

import com.sun.org.apache.regexp.internal.RE;
import com.third.Dao.LoginDao;
import com.third.domain.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private LoginDao loginDao;
    public int register(login login){
        int result = loginDao.register(login);
        return  result;
    }
    public boolean login(login login){
        login = loginDao.login(login);
        if(login!=null){
            return true;
        }else {
            return false;
        }
    }
    public int update(login login){
        int result = loginDao.update(login);
        return result;
    }
    public int delete(login login){
        int result = loginDao.delete(login);
        return  result;
    }
}
