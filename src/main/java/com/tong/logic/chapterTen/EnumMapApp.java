package com.tong.logic.chapterTen;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class EnumMapApp {

    public static void main(String[] args) {

    }


    public static Map<Size,Integer> countBySize(List<Clothes> clothes){
        Map<Size,Integer> map = new EnumMap<Size, Integer>(Size.class);
        for(Clothes c:clothes){
            Size size = c.getSize();
            Integer count = map.get(size);
            if(count != null){
                map.put(size,count + 1);
            }else {
                map.put(size,1);
            }
        }
        return map;
    }

}
