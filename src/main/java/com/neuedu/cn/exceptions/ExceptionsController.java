package com.neuedu.cn.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionsController {

    @RequestMapping("/exceptionsTest")
    public String login(ModelMap model) {
        System.out.println("---方法1---");
        String s = null;
        s.length();
        return "success";
    }
}
