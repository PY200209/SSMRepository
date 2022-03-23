package com.myBatis.Dao;

import com.myBatis.domain.second;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface secondDao {
    List<second> select();
    int insert(@Param("myname") String name,@Param("myage") String age);
    int insert2(second stu);
}
