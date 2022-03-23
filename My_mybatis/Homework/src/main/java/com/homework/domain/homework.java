package com.homework.domain;

public class homework {
    private String name;
    private String stu;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStu() {
        return stu;
    }

    public void setStu(String stu) {
        this.stu = stu;
    }

    @Override
    public String toString() {
        return "homework{" +
                "name='" + name + '\'' +
                ", stu='" + stu + '\'' +
                '}';
    }
}
