package com.bughome.springboot.model;

/**
 * @Author Zgh
 * @Date 2020/12/28 9:41
 */
public class User {
    private Integer Id;
    private String Name;
    private String Password;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
