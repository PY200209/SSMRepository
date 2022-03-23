package com.my.domain;

public class forth {
    private String stuName;
    private String stuAge;
    private String stuSex;


    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "forth{" +
                "stuName='" + stuName + '\'' +
                ", stuAge='" + stuAge + '\'' +
                ", stuSex='" + stuSex + '\'' +
                '}';
    }
}
