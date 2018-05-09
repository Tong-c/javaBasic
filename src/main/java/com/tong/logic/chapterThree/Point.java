package com.tong.logic.chapterThree;

public class Point {
    public int x;
    public int y;

    public Point(){
        this(0,0);//必須放第一行
    }

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.getX(),2)+Math.pow(y-p.getY(),2));
    }

    //默認值是Point@76f9aa66,默認實現代碼：getClass().getName() + "@" + Integer.toHexString(hashCode());
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
