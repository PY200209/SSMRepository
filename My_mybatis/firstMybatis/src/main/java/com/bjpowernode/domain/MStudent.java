package com.bjpowernode.domain;

public class MStudent {
    private String user;
    private Integer password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MStudentDao{" +
                "user='" + user + '\'' +
                ", password=" + password +
                '}';
    }
}
