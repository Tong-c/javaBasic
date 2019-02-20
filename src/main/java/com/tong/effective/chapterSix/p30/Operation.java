package com.tong.effective.chapterSix.p30;

/**
 * @Description: 將不同的行為與每個枚舉常量關聯起來
 * @Create: 2019/2/20 0020 上午 9:42
 */
public enum Operation {

    PLUS {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        double apply(double x, double y) {
            return x / y;
        }
    };

    abstract double apply(double x, double y);
}
