package com.imooc.superclass;

public abstract class Animal {
    private String name;
    private int age;

    public abstract String love();

    /**
     * 无参构造方法
     */
    public Animal() {
    }

    /**
     * 全部参数的构造方法
     *
     * @param name
     * @param age
     */
    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
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
}
