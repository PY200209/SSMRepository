package com.first.vo;

public class out {
    private Integer user,password;
    private String sex;

    public out(){}

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "out{" +
                "user=" + user +
                ", password=" + password +
                ", sex='" + sex + '\'' +
                '}';
    }
}
