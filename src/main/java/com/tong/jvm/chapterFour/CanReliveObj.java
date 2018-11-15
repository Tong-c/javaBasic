package com.tong.jvm.chapterFour;

/**
 * @Description: 《實戰java虛擬機》第七十頁示例：finalize()引用外泄，對象復活
 * @Create: 2018/11/14 0014 上午 9:54
 */
public class CanReliveObj {

    public static CanReliveObj obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj = this;
    }

    @Override
    public String toString() {
        return " I am CanReliveObj";
    }

    public static void main(String[] args) throws InterruptedException {
        obj = new CanReliveObj();
        obj = null;
        System.gc();

        Thread.sleep(1000);

        if (obj == null) {
            System.out.println("obj 是 null");
        } else {
            System.out.println("obj可用");
        }

        System.out.println("第2次gc");
        obj = null;
        System.gc();

        Thread.sleep(1000);

        if (obj == null) {
            System.out.println("obj是null");
        } else {
            System.out.println("obj可用");
        }
    }
}
