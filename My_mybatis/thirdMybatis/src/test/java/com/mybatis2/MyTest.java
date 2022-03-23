package com.mybatis2;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.mybatis2.utils.util;
import com.mybatis2.Dao.thirdDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    @Test
    public void test01(){
        SqlSession sqlSession = util.get_sqlSession();
        thirdDao third = sqlSession.getMapper(thirdDao.class);
        Map map = new HashMap<>();
        third.select1();
        map = third.selectByMap("张三");
        System.out.println(map);
        List list = new ArrayList<>();
        list.add("张三");
        list.add("光头强");
        third.selectByIn(list);
        int counts = third.getCounts();
        System.out.println(counts);
        sqlSession.commit();
        sqlSession.close();

    }

    public static void main(String[] args) {
        System.out.println();
    }

}
