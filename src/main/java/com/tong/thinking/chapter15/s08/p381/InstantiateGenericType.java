package com.tong.thinking.chapter15.s08.p381;

public class InstantiateGenericType {
    public static void main(String[] args) {
        try {
            ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Employee> failed");
        }
        System.out.println("ClassAsFactory<Employee> succeed");

        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactory<Integer> failed");
        }
        System.out.println("ClassAsFactory<Integer> succeed");
    }
}
