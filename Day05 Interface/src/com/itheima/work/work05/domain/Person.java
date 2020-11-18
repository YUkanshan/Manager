package com.itheima.work.work05.domain;

public abstract class Person {
    private String name;
    private int age;

//构造方法
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//成员方法
    public abstract void eat();
}
