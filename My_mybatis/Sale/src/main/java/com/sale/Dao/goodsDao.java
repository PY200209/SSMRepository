package com.sale.Dao;

import org.apache.ibatis.annotations.Param;

public interface goodsDao {
    Integer select1(Integer id);
    int update1(@Param("id") Integer id, @Param("amount") Integer amount);
}
