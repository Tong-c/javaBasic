package com.tong.logic.chapterFive;

public class CompUtil {

    public static Object max(MyComparable[] objs){
        if(objs == null||objs.length==0){
            return null;
        }

        MyComparable max = objs[0];
        for(int i = 1;i<objs.length;i++){
            if(max.compareTo(objs[i]) < 0){
                max= objs[i];
            }
        }
        return max;
    }


    public static void sort(Comparable[] objs){
        for(int i = 0;i<objs.length;i++){
            int min = 1;
            for(int j = i+ 1;j<objs.length;j++){
                if(objs[j].compareTo(objs[min]) < 0){
                    min = j;
                }
            }

            if(min != 1){
                Comparable temp = objs[i];
                objs[i] = objs[min];
                objs[min] = temp;
            }
        }
    }
}
