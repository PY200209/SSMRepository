package com.homework;

import com.homework.utils.util;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.homework.Dao.homeworkDao;
import com.homework.domain.homework;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        SqlSession sqlSession = util.get_sqlSession();
        homeworkDao homeworkDao = sqlSession.getMapper(homeworkDao.class);
        homeworkDao.insert("Java","张三");
        homeworkDao.insert("JavaEE","李四");
        homeworkDao.insert("JSP","王五");
        homeworkDao.insert("Servlet","光头强");
        homeworkDao.insert("Spring","刘大");
        homeworkDao.insert("SpringMVC","王菲");
        List<homework> list = homeworkDao.select();
        for (homework x:list){
            System.out.println(x);
        }
        list = homeworkDao.selectByLike("%J%");
        for (homework x:list){
            System.out.println(x);
        }
        homeworkDao.delete("JSP");
        homeworkDao.update("JavaEE","李华");
        list = homeworkDao.select();
        for (homework x:list){
            System.out.println(x);
        }
    }
}
