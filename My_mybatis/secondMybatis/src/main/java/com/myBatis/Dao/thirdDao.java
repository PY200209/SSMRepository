package com.myBatis.Dao;

import com.myBatis.domain.third;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface thirdDao {
    int insert1 (@Param("name") String name,@Param("age") String age,@Param("sex") String sex);
    List<third> select1 (String name);
    List<third> select2 (third third);
}
