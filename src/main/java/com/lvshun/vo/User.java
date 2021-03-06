package com.lvshun.vo;

/**
 * Created by Matthew on 17/5/10.
 */
public class User {

    private String username;
    private String phone;
    private String password;
    private String repassword;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone(){ return  phone;}

    public void setPhone(String phone){this.phone=phone;}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", repassword='" + repassword + '\'' +
                '}';
    }


    public User(String username, String phone, String password, String repassword) {
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.repassword = repassword;
    }
}
