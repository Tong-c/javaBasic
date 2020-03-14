package com.tong.practices.y2020.m03.day14;

public class CheckTest {

    private String one;
    private String two;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    private void check(CheckTest checked) {
        if (!checked.getOne().equals(this.one)) {
            checked.setOne("不相等");
        } else {
            checked.setOne("相等");
        }
        if (!checked.getTwo().equals(this.two)) {
            checked.setTwo("不相等");
        } else {
            checked.setTwo("相等");
        }
    }


    public static void main(String[] args) {
        CheckTest checkTest1 = new CheckTest();
        checkTest1.setOne("1");
        checkTest1.setTwo("2");
        CheckTest checkTest2 = new CheckTest();
        checkTest2.setOne("10");
        checkTest2.setTwo("20");
        checkTest1.check(checkTest2);
        System.out.println(checkTest2);
    }
}
