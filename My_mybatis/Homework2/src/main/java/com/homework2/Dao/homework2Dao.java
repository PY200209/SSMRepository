package com.homework2.Dao;

import com.homework2.domain.homework2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface homework2Dao {
    List<homework2> select();
    int insert(@Param("name") String name,@Param("stu") String stu);
    List<homework2> selectByLike(String like);
}
