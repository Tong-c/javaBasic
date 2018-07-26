package com.tong.basic.generic;


import java.util.Date;
import java.util.TreeMap;
import java.util.TreeSet;

public class DateInterval extends Pair<Date> {

    public void setSecond(Date second) {
        if(second.compareTo(getFirst())>0){
            super.setSecond(second);
        }
    }

}

