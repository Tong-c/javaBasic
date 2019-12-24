package com.tong.logic.chapterThree.person;

public class PersonApp {


    public static void main(String[] args) {
        Person laoma = new Person("老馬");
        Person xiaoma = new Person("小馬");
        xiaoma.setFather(laoma);
        laoma.setChildren(new Person[]{xiaoma});
        System.out.println(xiaoma.getFather().getName());
    }
}
