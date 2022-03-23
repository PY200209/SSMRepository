package com.sale.Dao;

import org.apache.ibatis.annotations.Param;

public interface saleDao {
    int insert1(@Param("id") Integer id,@Param("gid") Integer gid,@Param("nums") Integer nums);
}
