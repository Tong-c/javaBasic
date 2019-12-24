package com.tong.practices.y2019.m12.d15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Tong Chuang
 * @date: 2019/12/15
 */
public class Error {
    private List<String> messages = new ArrayList();

    public Error() {

    }

    public Error message(String message) {
        this.messages.add(message);
        return this;
    }

    public Error reset() {
        messages.clear();
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
        Error error = new Error();
        error.message("Main Thread Message");
        System.out.println(error);

        Runnable task1 = () -> {
            error.message("Task1 Thread Message");
            System.out.println(error);
        };

        Runnable task2 = () -> {
            error.message("Task2 Thread Message");
            System.out.println(error);
        };

        new Thread(task1).start();
        new Thread(task2).start();
        error.reset();
    }
}
