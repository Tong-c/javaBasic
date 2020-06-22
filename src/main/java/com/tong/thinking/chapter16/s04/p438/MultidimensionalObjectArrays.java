package com.tong.thinking.chapter16.s04.p438;

import com.tong.thinking.chapter16.s01.p432.BerylliumSphere;

import java.util.Arrays;

public class MultidimensionalObjectArrays {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {{new BerylliumSphere(), new BerylliumSphere()}, {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()}};
        System.out.println(Arrays.deepToString(spheres));
    }
}
