package com.newer.pojo;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String  brithday;
    private  String address;
    private String phone;

    public Author() {
    }

    public Author(int id, String name, String sex, String brithday, String address, String phone) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.brithday = brithday;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
