package com.neuedu.cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {




    @RequestMapping(value="/work",consumes = "application/json")
    @ResponseBody
    public Object work(@RequestBody Map<String,Object> param){

        System.out.println(param);
        Map<String,Object> returnMap=new HashMap<String,Object>();
        returnMap.put("resultContent","your work done");
        returnMap.put("resultCode","200");
        return returnMap;
    }

    @RequestMapping(value="/work2")
//    @ResponseBody
    public String work2(){

//        System.out.println(param);
//        Map<String,Object> returnMap=new HashMap<String,Object>();
//        returnMap.put("resultContent","your work done");
//        returnMap.put("resultCode","200");
        return "forward:/jsp/success.jsp";
    }
    @RequestMapping(value="/work3")
//    @ResponseBody
    public String work3(){

//        System.out.println(param);
//        Map<String,Object> returnMap=new HashMap<String,Object>();
//        returnMap.put("resultContent","your work done");
//        returnMap.put("resultCode","200");
        return "redirect:/jsp/Login.jsp";
    }

}
