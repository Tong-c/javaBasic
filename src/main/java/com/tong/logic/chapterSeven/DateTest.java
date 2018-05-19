package com.tong.logic.chapterSeven;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * java7 日期相關類
 */
public class DateTest {

    public static void main(String[] args) {
       testStringToDate();
    }


    public static void testDateFormat(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,07,15,14,15,20);
        System.out.println(DateFormat.getDateTimeInstance().format(calendar.getTime()));
        System.out.println(DateFormat.getDateInstance().format(calendar.getTime()));
        System.out.println(DateFormat.getTimeInstance().format(calendar.getTime()));
    }

    public static void testDateFormatWithStyle(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,07,15,14,15,20);
        System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT, Locale.CHINESE).format(calendar.getTime()));
    }

    public static void testSimpleDateFormat(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,07,15,14,15,20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 E HH時mm分ss秒");//E表示星期幾，HH表示24小時制
        System.out.println(sdf.format(calendar.getTime()));
    }

    public static void testSimpleDateFormatDetail(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,07,15,14,15,20);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");//hh表示12小時制，a表示上午或下午
        System.out.println(sdf.format(calendar.getTime()));
    }

    public static void testStringToDate(){
        String str = "2016-08-15 14:15:20.456";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {

            Date date = sdf.parse(str);
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年M月d日 h:m:s.S a");
            System.out.println(sdf2.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
