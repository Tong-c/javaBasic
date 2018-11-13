package com.tong.jvm.chapterThree;

import java.nio.ByteBuffer;

/**
 * @Description: 《實戰java虛擬機》第五十五頁示例：統計直接內存和堆內存的讀寫速度
 * @Create: 2018/11/13 0013 上午 9:41
 */
public class AccessDirectBuffer {

    /**
     * 直接內存讀寫
     */
    public void directAccess() {
        long startTime = System.currentTimeMillis();
        ByteBuffer b = ByteBuffer.allocateDirect(500);
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 99; j++) {
                b.putInt(j);
            }
            b.flip();
            for (int j = 0; j < 99; j++) {
                b.getInt();
            }
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testDirectWriter:" + (endTime - startTime));
    }

    /**
     * 堆內存讀寫
     */
    public void bufferAccess() {
        long startTime = System.currentTimeMillis();
        ByteBuffer b = ByteBuffer.allocate(500);
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 99; j++) {
                b.putInt(j);
            }
            b.flip();
            for (int j = 0; j < 99; j++) {
                b.getInt();
            }
            b.clear();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("testBufferWrite:" + (endTime - startTime));

    }

    public static void main(String[] args) {
        AccessDirectBuffer alloc = new AccessDirectBuffer();
        alloc.bufferAccess();
        alloc.directAccess();

        alloc.bufferAccess();
        alloc.directAccess();
    }
}
