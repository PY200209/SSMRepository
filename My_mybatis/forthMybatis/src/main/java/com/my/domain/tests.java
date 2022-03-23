package com.my.domain;

public class tests {
    private String user;
    private String howOld;
    private String sex;


    public void setUser(String user) {
        this.user = user;
    }

    public void setHowOld(String howOld) {
        this.howOld = howOld;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "tests{" +
                "user='" + user + '\'' +
                ", howOld='" + howOld + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
