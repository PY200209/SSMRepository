package com.bjpowernode.dao;

import com.bjpowernode.domain.Student1;

import java.util.List;
//Dao接口定义我们操作MySQL的sql方法，要求接口的命名格式为：表名+Dao
public interface Student1Dao {
    /*mybatis执行select语句后会将这个表的ResultSet存入一个相应类的数组中*/
    public List<Student1> selectStudent1();
}
