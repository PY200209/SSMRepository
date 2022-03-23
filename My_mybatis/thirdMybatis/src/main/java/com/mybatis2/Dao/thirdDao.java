package com.mybatis2.Dao;

import com.mybatis2.domain.third;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface thirdDao {
    List<third> select1();
    List<third> select2(third third);
    List<third> select3(@Param("name") String name,@Param("age") String age);
    int insert1(@Param("name") String name,@Param("age") String age,@Param("sex") String sex);
    int insert2(third third);
    int getCounts();
    List<third> selectByIn(List list);
    Map selectByMap(String name);
    int insertByMap(Map map);
}
