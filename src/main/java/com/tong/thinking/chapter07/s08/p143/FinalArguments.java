package com.tong.thinking.chapter07.s08.p143;

public class FinalArguments {
    void with(final Gizmo gizmo) {
        //final修飾引用類型，無法更改參數應用所指向的對象
    }

    void without(Gizmo gizmo) {
        gizmo = new Gizmo();
        gizmo.spin();
    }

    int g(final int i) {
        //final修飾基本類型，該參數只可讀，無法修改，i++報錯
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
