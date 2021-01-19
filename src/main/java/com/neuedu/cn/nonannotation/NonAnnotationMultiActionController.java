package com.neuedu.cn.nonannotation;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NonAnnotationMultiActionController extends MultiActionController {


    public ModelAndView login(HttpServletRequest request,
                            HttpServletResponse response) {
        System.out.println("----add----");
        return new ModelAndView("/multi", "message", "add");
    }

    public ModelAndView validate(HttpServletRequest request,
                               HttpServletResponse response) {
        System.out.println("----update----");
        return new ModelAndView("/multi", "message", "update");
    }


}
