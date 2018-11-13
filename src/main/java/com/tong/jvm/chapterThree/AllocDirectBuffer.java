package com.tong.jvm.chapterThree;

import java.nio.ByteBuffer;

/**
 * @Description: 《實戰java虛擬機》第五十七頁示例：統計直接內存和堆內存的內存空間申請速度
 * @Create: 2018/11/13 0013 上午 9:51
 */
public class AllocDirectBuffer {

    /**
     * 直接內存內存申請
     */
    public void directAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            ByteBuffer b = ByteBuffer.allocateDirect(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("directAllocate:" + (endTime - startTime));

    }

    /**
     * 堆內存內存申請
     */
    public void bufferAllocate() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            ByteBuffer b = ByteBuffer.allocate(1000);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("bufferAllocate:" + (endTime - startTime));
    }

    public static void main(String[] args) {
        AllocDirectBuffer alloc = new AllocDirectBuffer();
        alloc.bufferAllocate();
        alloc.directAllocate();

        alloc.bufferAllocate();
        alloc.directAllocate();
    }


}
