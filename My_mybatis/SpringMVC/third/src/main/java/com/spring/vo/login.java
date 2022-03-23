package com.spring.vo;

public class login {
    private Integer user,password;
    private String name;

    @Override
    public String toString() {
        return "login{" +
                "user=" + user +
                ", password=" + password +
                ", name='" + name + '\'' +
                '}';
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
