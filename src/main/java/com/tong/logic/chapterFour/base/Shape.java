package com.tong.logic.chapterFour.base;

public class Shape {
    private static final String DEFAULT_COLOR = "balck";
    private String color;

    public Shape(){
        this(DEFAULT_COLOR);
    }

    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void draw(){
        System.out.println("draw shape");
    }
}
