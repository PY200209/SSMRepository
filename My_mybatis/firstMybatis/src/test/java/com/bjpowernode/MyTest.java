package com.bjpowernode;

import com.bjpowernode.dao.FirstDao;
import com.bjpowernode.dao.FirstDaoImpl;
import com.bjpowernode.domain.BStudent;
import com.bjpowernode.domain.First;
import com.bjpowernode.domain.MStudent;
import com.bjpowernode.domain.Student1;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.bjpowernode.Utils.util;

public class MyTest {
    @Test
    public void test1() throws IOException {
       SqlSession sqlSession = util.get_sqlSession();
        String sql = "com.bjpowernode.dao.FirstDao.insert";
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        First one = (First) app.getBean("one");
        /*int x = sqlSession.insert(sql,one);*/
        String delete = "com.bjpowernode.dao.FirstDao.delete";
        int x = sqlSession.delete(delete,one);
        String sqlId = "com.bjpowernode.dao.FirstDao.select";
        List<First> list = sqlSession.selectList(sqlId);
        for(First a : list){
            System.out.println(a);
        }

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test2(){
        FirstDao firstDao = new FirstDaoImpl();
        List<First> list = firstDao.select();
        for(First a:list){
            System.out.println(a);
        }
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        First one = (First) app.getBean("one");
        firstDao.insert(one);
        list = firstDao.select();
        for(First a:list){
            System.out.println(a);
        }
    }
    @Test
    public  void test3(){
        SqlSession sqlSession = util.get_sqlSession();
        /*通过getMapper(xx.class)来创建接口的实例类对象*/
        FirstDao first = sqlSession.getMapper(FirstDao.class);
        int nums = first.insert2("王三","88");
        List<First> list = first.select();
        for (First a:list){
            System.out.println(a);
        }
    }
}
