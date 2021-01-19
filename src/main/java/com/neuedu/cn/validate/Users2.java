package com.neuedu.cn.validate;

import java.util.Arrays;

public class Users2 {
    private String id;
    private String acc;
    private String phone;
    private String email;
    private String pwd;
    private String address;
    private String[] happy;

    public String[] getHappy() {
        return happy;
    }

    public void setHappy(String[] happy) {
        this.happy = happy;
    }



    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", acc='" + acc + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", happy=" + Arrays.toString(happy) +
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
