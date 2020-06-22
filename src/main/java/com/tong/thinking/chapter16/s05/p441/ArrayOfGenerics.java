package com.tong.thinking.chapter16.s05.p441;

import com.tong.thinking.chapter16.s01.p432.BerylliumSphere;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {

    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[]) la;
        ls[0] = new ArrayList<String>();

        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[]) new List[10];
        for (int i = 0; i < spheres.length; i++) {
            spheres[i] = new ArrayList<BerylliumSphere>();
        }
    }

}
