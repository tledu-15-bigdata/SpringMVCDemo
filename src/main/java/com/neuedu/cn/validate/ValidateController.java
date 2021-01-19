package com.neuedu.cn.validate;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;




@Controller("validateController")
public class ValidateController {



    /*
    *JSON操作无法和校验一起使用
    *
    * */
    @RequestMapping(value = "/validate1",consumes = "application/json")
    @ResponseBody
    public Users2 validateWork1(@RequestBody Users2  users){
        System.out.println(users);
        return users;
    }

    @RequestMapping(value = "/validate2")
    public ModelAndView validateWork2(@Validated Users users, BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
//            for (ObjectError error : errors) {
//                System.out.println(error.getDefaultMessage());
//            }

            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            fieldErrors.forEach(fieldError ->{
                System.out.println(fieldError.getField());
                System.out.println(fieldError.getDefaultMessage());
            });
        }
        ModelAndView mv=new ModelAndView();
        mv.addObject("users",users);
        System.out.println(users);
        return mv;
    }







}
