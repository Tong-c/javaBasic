package com.tong.logic.chapterFour.base;

import com.tong.logic.chapterFour.base.Shape;

public class ShapeManager {
    private static final int MAX_NUM = 100;
    private Shape[] shapes = new Shape[MAX_NUM];
    private int shapeNum = 0;

    public void addShape(Shape shape){
        if(shapeNum<MAX_NUM){
            shapes[shapeNum++] = shape;
        }
    }

    public void draw(){
        for(int i = 0;i<shapeNum;i++){
            shapes[i].draw();
        }
    }
}
