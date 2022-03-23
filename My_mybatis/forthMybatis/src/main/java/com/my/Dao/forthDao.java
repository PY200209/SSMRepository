package com.my.Dao;

import com.my.domain.forth;
import com.my.domain.tests;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface forthDao {
   List<tests> select1(@Param("name") String name,@Param("age") String age);
   List<tests> select2(tests test);
}
