package com.homework.Dao;

import com.homework.domain.homework;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface homeworkDao {
    List<homework> select();
    int insert(@Param("name") String name,@Param("stu") String stu);
    int update(@Param("name") String name,@Param("stu") String stu);
    int delete(String name);
    List<homework> selectByLike(String like);
}
