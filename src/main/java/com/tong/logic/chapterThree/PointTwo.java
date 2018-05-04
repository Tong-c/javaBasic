package com.tong.logic.chapterThree;

public class PointTwo {
    private int x;
    private int y;

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
       this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }


    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
}
