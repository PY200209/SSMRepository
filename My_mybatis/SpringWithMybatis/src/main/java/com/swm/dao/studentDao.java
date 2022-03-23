package com.swm.dao;
import com.swm.domin.student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentDao {
    List<student> select1();
    int insert(@Param("id") Integer id,@Param("name") String name,@Param("age") Integer age,@Param("status") String status);
}
