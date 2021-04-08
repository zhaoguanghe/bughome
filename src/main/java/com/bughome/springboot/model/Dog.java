package com.bughome.springboot.model;

/**
 * @Author Zgh
 * @Date 2020/12/25 19:43
 */
public class Dog {
    private String name;
    private Integer age;

//    快捷键：Alt+Insert
//    getter,setter方法
//    toString方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override //表示要重写toString方法，覆盖父类
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
