package com.neuedu.cn.converter;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller("ConverterController2")
public class ConverterController2 {



    @RequestMapping(value = "/convertDate2")
    @ResponseBody
    public Users3 validateWork1(Users3 users){
        System.out.println(users);
        return users;
    }
}
