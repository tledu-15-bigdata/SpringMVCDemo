package com.neuedu.cn.nonannotation;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NonAnnotationController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        String acc = httpServletRequest.getParameter("acc");
        String pwd = httpServletRequest.getParameter("pwd");
        System.out.println(acc+"  "+pwd);
        ModelAndView mv=new ModelAndView();
        mv.addObject("acc",acc);
        mv.addObject("pwd",pwd);
        mv.setViewName("/jsp/success");
        return mv;
    }
}
