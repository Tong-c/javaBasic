package com.tong.practices.y2019.m12.d15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tong Chuang
 * @date: 2019/12/15
 */
public class ErrorContext {
    private List<String> messages = new ArrayList<>();

    private static final ThreadLocal LOCAL = new ThreadLocal();

    private ErrorContext() {

    }

    public static ErrorContext getInstance() {
        ErrorContext context = (ErrorContext) LOCAL.get();
        if (context == null) {
            context = new ErrorContext();
            LOCAL.set(context);
        }
        return context;
    }

    public ErrorContext message(String message) {
        this.messages.add(message);
        return this;
    }

    public ErrorContext reset() {
        messages.clear();
        LOCAL.remove();
        return this;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        for (String msg : messages) {
            description.append("### ");
            description.append(msg);
            description.append("\n");
        }
        return description.toString();
    }

    public static void main(String[] args) {
        ErrorContext cxtMain = ErrorContext.getInstance();
        cxtMain.message("Main Thread Message");
        System.out.println(cxtMain);
        cxtMain.reset();

        Runnable task1 = () -> {
            ErrorContext cxtTask1 = ErrorContext.getInstance();
            cxtTask1.message("Task1 Thread Message");
            System.out.println(cxtTask1);
            cxtTask1.reset();
        };

        Runnable task2 = () -> {
            ErrorContext cxtTask2 = ErrorContext.getInstance();
            cxtTask2.message("Task2 Thread Message");
            System.out.println(cxtTask2);
            cxtTask2.reset();
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
