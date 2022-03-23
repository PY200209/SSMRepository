package com.swm;

import com.swm.domin.student;
import com.swm.service.impl.service1Impl;
import com.swm.service.service1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.swm.dao.studentDao;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        service1 service1 = (com.swm.service.service1) applicationContext.getBean("service1");
        List<student> list =  service1.select();
        System.out.println(list);

    }
}
