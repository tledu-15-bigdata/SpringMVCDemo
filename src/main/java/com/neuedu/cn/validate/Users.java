package com.neuedu.cn.validate;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*
* 1.@NotNull：不能为null，但可以为empty。

2.@NotEmpty：不能为null，而且长度必须大于0

3.@NotBlank：只能作用在String上，不能为null，而且调用trim()后，长度必须大于0
* */
public class Users {

//    @Min(8)
    private int age;
    private String id;
    @NotEmpty(message="账号不能为空")
    private String acc;
    private String phone;
    @Email(message="邮箱格式错误")
    private String email;
    @NotEmpty(message="密码不能为空")
    private String pwd;
    private String address;
    private String[] happy;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private Date birth;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        14    String dateString = formatter.format(currentTime);
        return "Users{" +
                "age=" + age +
                ", id='" + id + '\'' +
                ", acc='" + acc + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", address='" + address + '\'' +
                ", happy=" + Arrays.toString(happy) +
                ", birth=" + birth.toString() +
                ", birth2=" +formatter.format(birth)  +
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
