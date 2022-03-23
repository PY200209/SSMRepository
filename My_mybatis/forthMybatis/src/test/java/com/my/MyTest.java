package com.my;

import com.my.domain.AopTest;
import com.my.domain.forth;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.my.utils.util;
import com.my.Dao.forthDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void test01() {
        SqlSession sqlSession = util.get_sqlSession();
        forthDao forth = sqlSession.getMapper(forthDao.class);
        forth.select1(null,"-1");
    }
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AopTest x = (AopTest) applicationContext.getBean("test");
        System.out.println(x.getADD(2,3));
    }
}
