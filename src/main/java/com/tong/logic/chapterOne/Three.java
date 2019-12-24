package com.tong.logic.chapterOne;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        testForContinue();
    }

    public static void testWhile() {
        Scanner reader = new Scanner(System.in);
        System.out.println("please input password");
        int num = reader.nextInt();
        int password = 6789;
        while (num != password) {
            System.out.println("please input password");
            num = reader.nextInt();
        }
        System.out.println("correct");
        reader.close();
    }

    //不管條件語句是什麽，代碼至少執行一次，do/while
    public static void testDoWhile() {
        Scanner reader = new Scanner(System.in);
        int password = 6789;
        int num = 0;
        do {
            System.out.println("please input password");
            num = reader.nextInt();
        } while (num != password);
        System.out.println("correct");
        reader.close();
    }

    public static void testFor() {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //死循環
    public static void testForTwo() {
        for (; ; ) {
        }
    }

    public static void testForEach() {
        int[] arr = {1, 2, 3, 4};
        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void testForBreak() {
        int[] arr = {1, 2, 3, 4};
        int toSearch = 100;
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == toSearch) {
                break;
            }
        }
        if (i != arr.length) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

    }

    public static void testForContinue() {
        int[] arr = {1, 2, 3, 4};
        int toSearch = 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != toSearch) {
                continue;
            }
            count++;
        }

        System.out.println("found count " + count);
    }
}
