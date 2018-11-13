package com.tong.jvm.chapterThree;

/**
 * @Description: 《實戰java虛擬機》第四十六頁示例：最大堆、初始堆、系統可用內存
 * @Create: 2018/11/10 0010 上午 9:41
 */
public class HeapAlloc {
    public static void main(String[] args) {

        //打印系統的基本信息
        System.out.print("maxMemory=");//最大可用內存
        System.out.println(Runtime.getRuntime().maxMemory() + " bytes");
        System.out.print("free mem=");//當前空閒內存
        System.out.println(Runtime.getRuntime().freeMemory() + " bytes");
        System.out.print("total mem=");//當前總內存
        System.out.println(Runtime.getRuntime().totalMemory() + " bytes");

        //分配1M空間給數組後，系統的基本信息
        byte[] b = new byte[1 * 1024 * 1024];
        System.out.println("分配了1M的空間給數組");

        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory() + " bytes");
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory() + " bytes");
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory() + " bytes");

        //分配4M空間給數組後，系統的基本信息
        b = new byte[4 * 1024 * 1024];
        System.out.println("分配了4M空間給數組");

        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory() + " bytes");
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory() + " bytes");
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory() + " bytes");
    }
}
