package com.sale.domain;

public class sale {
    private Integer id;
    private Integer gid;
    private Integer nums;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
