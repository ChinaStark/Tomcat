package com.Luv.pojo1;

public class User {
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + pwd + '\'' +
                '}';
    }
}
