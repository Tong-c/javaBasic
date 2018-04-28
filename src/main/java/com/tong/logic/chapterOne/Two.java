package com.tong.logic.chapterOne;

public class Two {
    public static void main(String[] args) {
        testIf();
    }

    // 條件混亂
    public static void testIf(){
        int score = 90;
        if(score >= 60){
            System.out.println("及格"); //輸出
        }else if(score >= 80){
            System.out.println("良好");
        }else {
            System.out.println("優秀"); //期望輸出
        }
    }


}
