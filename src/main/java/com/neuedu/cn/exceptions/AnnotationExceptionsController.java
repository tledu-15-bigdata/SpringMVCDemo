package com.neuedu.cn.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnnotationExceptionsController {

    @RequestMapping("/annotationExceptionsTest1")
    public String login1(ModelMap model) {
        System.out.println("---方法1---");
        String s = null;
        s.length();
        return "jsp/annotationException/success2";
    }

    @RequestMapping("/annotationExceptionsTest2")
    public String login2(ModelMap model) throws BusinessException {
        throw new BusinessException("我是自定义异常1");
    }


}
