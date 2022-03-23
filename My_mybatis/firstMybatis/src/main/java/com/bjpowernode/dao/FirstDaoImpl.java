package com.bjpowernode.dao;

import com.bjpowernode.domain.First;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import com.bjpowernode.Utils.util;
public class FirstDaoImpl implements FirstDao {
    @Override
    public List<First> select() {
        SqlSession sqlSession = util.get_sqlSession();
        List<First> list = sqlSession.selectList("com.bjpowernode.dao.First.select");
        sqlSession.commit();
        sqlSession.close();
        return  list;
    }

    @Override
    public int insert(First one) {
        SqlSession sqlSession = util.get_sqlSession();
        int nums = sqlSession.insert("com.bjpowernode.dao.First.insert",one);
        sqlSession.commit();
        sqlSession.close();
        return nums;
    }
    @Override
    public int insert2(@Param("myname") String name, @Param("myage") String age){
        return 0;
    }


}
