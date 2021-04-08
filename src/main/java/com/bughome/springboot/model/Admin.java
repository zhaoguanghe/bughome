package com.bughome.springboot.model;

/**
 * @Author Zgh
 * @Date 2021/1/10 15:10
 */
public class Admin extends User{
    private Integer UID;
    private String username;
    private String password;

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String args[]){
        Admin admin = new Admin();
        admin.setUsername("zgh");
        System.out.println(admin.getUsername());
    }
}
