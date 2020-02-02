package com.tong.thinking.chapter12.s08.p268;

public class LostMessages {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }


    void dispose() throws NoHumException {
        throw new NoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessages lm = new LostMessages();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
