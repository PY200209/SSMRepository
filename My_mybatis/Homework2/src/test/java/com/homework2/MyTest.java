package com.homework2;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.homework2.utils.util;
import com.homework2.Dao.homework2Dao;
import com.homework2.domain.homework2;
public class MyTest {
    @Test
    public  void test01(){
        SqlSession sqlSession = util.get_sqlSession();
        homework2Dao homework2Dao = sqlSession.getMapper(homework2Dao.class);
        homework2Dao.insert("Java","张三");
        homework2Dao.insert("C++","李四");
        homework2Dao.insert("Mybatis","王五");
        homework2Dao.select();
        homework2Dao.selectByLike("%J%");
        sqlSession.commit();
        sqlSession.close();
    }
}
