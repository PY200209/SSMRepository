package com.sale.service;

import com.sale.Dao.goodsDao;
import com.sale.Dao.saleDao;

public class service1 {
    private goodsDao goodsDao;
    private saleDao saleDao;

    public void setGoodsDao(com.sale.Dao.goodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(com.sale.Dao.saleDao saleDao) {
        this.saleDao = saleDao;
    }
    public int sale(Integer id,Integer nums){

        saleDao.insert1(id,1,nums);
        Integer amount = goodsDao.select1(id);
        amount= amount-nums;
        int result= goodsDao.update1(id,amount);
        return result;
    }
}
