package com.neuedu.cn.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    Date resultDate=null;
@Override    
public Date convert(String source) {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//    dateFormat.setLenient(false);
    try {
        resultDate= dateFormat.parse(source);
    } catch (ParseException e) {
        e.printStackTrace();
    }

    return resultDate;
}
}