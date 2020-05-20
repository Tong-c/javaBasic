package com.tong.thinking.chapter15.s04.p367;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.EnumSet;
import java.util.Set;

import static com.tong.thinking.chapter15.s04.p367.Sets.*;
import static com.tong.thinking.chapter15.s04.p367.Watercolors.*;
import static net.mindview.util.Sets.union;

/**
 * @author: Tong Chuang
 * @date: 2020/5/20
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIAN_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        System.out.println("intersection(set1, set2): " + subset);
        System.out.println("difference(set1, subset): " + difference(set1, subset));
        System.out.println("difference(set2, subset): " + difference(set2, subset));
        System.out.println("complement(set1, set2): " + complement(set1, set2));
    }
}
