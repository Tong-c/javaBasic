package com.tong.practices.y2020.m05.d21;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author: Tong Chuang
 * @date: 2020/5/21
 */
public class BrandServiceTest {
    public static void main(String[] args) {
        ServiceLoader<IBrandService> load = ServiceLoader.load(IBrandService.class);
        Iterator<IBrandService> iterator = load.iterator();
        while (iterator.hasNext()) {
            String subClassName = iterator.next().getClass().getSimpleName();
            System.out.println(subClassName);
        }
    }
}
