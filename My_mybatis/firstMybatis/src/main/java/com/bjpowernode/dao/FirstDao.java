package com.bjpowernode.dao;

import com.bjpowernode.domain.First;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstDao {
    List<First> select();
    int insert(First one);
    int insert2(@Param("myname") String name ,@Param("myage") String age);
}
