package com.bjpowernode.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("one")
public class First {
    @Value("孔空")
    private String name;
    @Value("30")
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "First{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
