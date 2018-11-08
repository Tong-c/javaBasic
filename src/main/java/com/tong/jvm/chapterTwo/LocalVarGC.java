package com.tong.jvm.chapterTwo;

/**
 * @Description: 《實戰java虛擬機》第三十一頁示例：局部變量對垃圾回收的影響
 * @Create: 2018/11/8 0008 上午 9:42
 */
public class LocalVarGC {

    public void localvarGc1() {
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
    }

    public void localvarGc2() {
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    public void localvarGc3() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localvarGc4() {
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c = 10;
        System.gc();
    }

    public void localvarGc5() {
        localvarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC ins = new LocalVarGC();
        ins.localvarGc2();
    }


}
