package com.swm.service.impl;

import com.swm.domin.student;
import com.swm.service.service1;
import org.apache.ibatis.session.SqlSession;
import com.swm.utils.util;
import com.swm.dao.studentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class service1Impl implements service1 {
    private studentDao studentDao ;
    @Override
    public List<student> select() {
        List<student> list = studentDao.select1();
        return list;
    }

    @Override
    public int add(Integer id, String name, Integer age, String status) {
        int nums = studentDao.insert(id, name, age, status);
        return nums;
    }

    public void setStudentDao(com.swm.dao.studentDao studentDao) {
        this.studentDao = studentDao;
    }
}
