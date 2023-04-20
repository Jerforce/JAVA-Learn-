package com.itheima.a01mycollection;

import java.util.Objects;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

/*
* 集合中存储的是自定义对象(student)，
* 也想通过contains方法来判断是否包含，那么在javabean类中，
* 如果存的是自定义对象，没有重写equals方法，
* 那么默认使用Object类中的equals方法进行判断，
* 而Object类中equals方法，依赖地址值进行判断。
* */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
