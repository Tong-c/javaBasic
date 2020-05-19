package com.tong.practices.y2019.m12.d25;

import java.lang.ref.WeakReference;

/**
 * @author: Tong Chuang
 * @date: 2019/12/25
 */
public class ReferenceTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        WeakReference<StringBuilder> weakBuilder = new WeakReference<>(builder);
    }
}
