package com.tong.practices.y2020.m03.day19;

/**
 * @author: Tong Chuang
 * @date: 2020/3/19
 */
public class Test {
    private String field1;
    private String field2;
    public String field3 = field1 + field2;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.setField1("hah");
        test.setField2("bling");
        System.out.println(test.getField3());
    }
}
