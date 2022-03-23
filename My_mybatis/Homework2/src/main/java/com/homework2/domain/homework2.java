package com.homework2.domain;

public class homework2 {
    private String name;
    private String stu;

    @Override
    public String toString() {
        return "homework2{" +
                "name='" + name + '\'' +
                ", stu='" + stu + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }

    public String getStu() {
        return stu;
    }

    public String getName() {
        return name;
    }
}
