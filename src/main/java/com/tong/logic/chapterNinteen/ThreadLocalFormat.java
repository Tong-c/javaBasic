package com.tong.logic.chapterNinteen;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
   * @Description:    ThreadLocal日期處理
   * @Author:     仝闖    
   * @Create:     2018/8/9 0009 下午 6:01
   */
public class ThreadLocalFormat {

    static ThreadLocal<DateFormat> sdf = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String date2String(Date date){
        return sdf.get().format(date);
    }

    public static Date String2Date(String str) throws ParseException {
        return sdf.get().parse(str);
    }

}
