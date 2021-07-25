package com.lagou.phase01.module04.homework.excise04;

public class User implements java.io.Serializable {

    private static final long serialVersionUID = 9494L;

    private String username;
    private String pwd;

    public User() {}

    public User(String username, String pwd) {
        setUsername(username);
        setPwd(pwd);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
