package com.swm.domin;

public class student {
    private Integer id;
    private String name;
    private Integer age;
    private String status;
    public student(){}
    public student(Integer id, String name, Integer age, String status){
        this.id=id;this.name=name;this.age=age;this.status=status;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}
