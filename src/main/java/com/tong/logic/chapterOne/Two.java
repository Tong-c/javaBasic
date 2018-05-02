package com.tong.logic.chapterOne;

public class Two {
    public static void main(String[] args) {
        testSwith();
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

    //缺少break,全部執行
    public static void testSwith(){
        int a = 1;
        switch (a){ //輸出123
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("3");
        }
    }

    //case後可為空，執行第一個不為空語句
    public static void testSwitchTwo(){
        char c = 'A';
        switch (c){
            case 'A':
            case 'B':
            case 'C':
                System.out.println("A-Z");
                break;
            case 'D':
                System.out.println("others");
                break;
        }
    }






}
