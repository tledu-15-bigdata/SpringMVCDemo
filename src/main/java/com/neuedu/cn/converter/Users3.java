package com.neuedu.cn.converter;

import java.util.Arrays;
import java.util.Date;

public class Users3{
    private String id;
    private String acc;
    private String phone;
    private String email;
    private String pwd;
    private String address;
    private String[] happy;
    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String[] getHappy() {
        return happy;
    }

    public void setHappy(String[] happy) {
        this.happy = happy;
    }


    @Override
    public String toString() {
        return "Users3{" +
                "id='" + id + '\'' +
                ", acc='" + acc + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", happy=" + Arrays.toString(happy) +
                ", birth=" + birth +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
