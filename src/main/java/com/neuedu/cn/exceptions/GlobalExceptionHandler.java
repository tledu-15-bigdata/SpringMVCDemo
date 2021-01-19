package com.neuedu.cn.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

//	private final static AsJEELogger LOG = AsJEELoggerFactory.getLogger(GlobalExceptionHandler.class);

	private final static String EXPTION_MSG_KEY = "message";

	@ExceptionHandler(BusinessException.class)
//	@ResponseBody
	public ModelAndView handleBizExp(HttpServletRequest request, Exception ex) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", ex.getMessage());
		mv.setViewName("/jsp/annotationException/BusinessException");
		return mv;
	}



	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleBizExp3(HttpServletRequest request,Exception ex) {

		System.out.println("---222");



		ModelAndView mv=new ModelAndView();
//		System.out.println(ex.getMessage());
//		System.out.println(num.getMessage());
		request.getSession().setAttribute(EXPTION_MSG_KEY, "空指针异常");
		mv.setViewName("/jsp/annotationException/success");
		return mv;
	}
}