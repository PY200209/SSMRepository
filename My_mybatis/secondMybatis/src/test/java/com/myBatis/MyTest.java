package com.myBatis;

import com.myBatis.Utils.util;
import com.myBatis.domain.second;
import com.myBatis.domain.third;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.myBatis.Dao.secondDao;

import java.util.List;
import com.myBatis.Dao.thirdDao;
public class MyTest {
    @Test
    public void test01(){
        SqlSession sqlSession = util.get_sqlSession();
        secondDao secondDao = sqlSession.getMapper(secondDao.class);
        int nums = secondDao.insert("王强","56");
        second one = new second();
        one.setName("袁弘");
        one.setAge("79");
        secondDao.insert2(one);
        List<second> list = secondDao.select();
        for(second a : list){
            System.out.println(a);
        }
    }
    @Test
    public void test02(){
        SqlSession sqlSession = util.get_sqlSession();
        thirdDao thirdDao = sqlSession.getMapper(thirdDao.class);
        thirdDao.insert1("张三","20","男");
        thirdDao.insert1("李四","29","女");
        thirdDao.select1("张三");
        third third = new third();
        third.setName("李四");
        third.setAge("29");
        thirdDao.select2(third);
    }
}
