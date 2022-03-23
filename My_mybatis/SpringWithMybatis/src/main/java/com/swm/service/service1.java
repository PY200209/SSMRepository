package com.swm.service;

import com.swm.domin.student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface service1 {
    List<student> select();
    int add(Integer id,  String name,  Integer age,  String status);
}
