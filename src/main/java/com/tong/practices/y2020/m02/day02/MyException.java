package com.tong.practices.y2020.m02.day02;

public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException() {
        super();
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException("illegal argument exception");
        } catch (Exception e) {
            throw new MyException(e);
        }
    }
}
