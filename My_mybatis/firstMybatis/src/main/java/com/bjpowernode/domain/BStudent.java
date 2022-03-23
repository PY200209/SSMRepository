package com.bjpowernode.domain;

public class BStudent {
    private String user;
    private  String chinese_name;

    @Override
    public String toString() {
        return "BStudent{" +
                "user='" + user + '\'' +
                ", chinese_name='" + chinese_name + '\'' +
                '}';
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setChinese_name(String chinese_name) {
        this.chinese_name = chinese_name;
    }
}
