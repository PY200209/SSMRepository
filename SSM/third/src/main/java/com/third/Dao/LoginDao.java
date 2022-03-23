package com.third.Dao;

import com.third.domain.login;

public interface LoginDao {
    int register(login login);

    login login(login login);

    int update(login login);

    int delete(login login);
}
