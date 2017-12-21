package com.edu.zucc.yj.finalwork.model;

public class User {
    private String user_account;
    private String user_password;
    private String user_email;
    private String user_name;
    private String user_level;
    private String user_class;
    private String user_studentid;

    public String getUser_account() {
        return user_account;
    }

    public void setUser_account(String user_account) {
        this.user_account = user_account;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_level() {
        return user_level;
    }

    public void setUser_level(String user_level) {
        this.user_level = user_level;
    }

    public String getUser_class() {
        return user_class;
    }

    public void setUser_class(String user_class) {
        this.user_class = user_class;
    }

    public String getUser_studentid() {
        return user_studentid;
    }

    public void setUser_studentid(String user_studentid) {
        this.user_studentid = user_studentid;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_account='" + user_account + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_level='" + user_level + '\'' +
                ", user_class='" + user_class + '\'' +
                ", user_studentid='" + user_studentid + '\'' +
                '}';
    }
}