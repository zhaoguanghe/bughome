package com.bughome.springboot.model;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
import java.util.List;

/**
 * @Author Zgh
 * @Date 2020/12/25 18:45
 * @ConfigurationProperties 告诉SpringBoot将本类的所有属性和配置文件中相关的配置进行绑定，高版本
 * SpringBoot需要加上@EnableConfigurationProperties(配置类.class)
 */
@Component
//@EnableConfigurationProperties(Person.class)
//@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

//    private Map<String,Object> maps;
//    private List<Object> lists;
//    private Dog dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                '}';
    }
}
