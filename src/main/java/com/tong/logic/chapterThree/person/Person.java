package com.tong.logic.chapterThree.person;

public class Person {

    private String name;
    private Person father;
    private Person mother;
    private Person[] children;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person[] getChildren() {
        return children;
    }

    public void setChildren(Person[] children) {
        this.children = children;
    }
}
