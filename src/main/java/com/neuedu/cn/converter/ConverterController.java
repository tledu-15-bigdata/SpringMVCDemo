package com.neuedu.cn.converter;

import com.neuedu.cn.validate.Users2;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ConverterController {


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("---");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
    }

    @RequestMapping(value = "/convertDate1")
    @ResponseBody
    public Users3 validateWork1(Users3 users){
        System.out.println(users);
        return users;
    }
}
