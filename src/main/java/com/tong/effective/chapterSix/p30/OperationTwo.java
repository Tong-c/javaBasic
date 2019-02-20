package com.tong.effective.chapterSix.p30;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 特定與常量的方法實現可以與特定與常量的數據結合起來
 * @Create: 2019/2/20 0020 上午 9:50
 */
public enum OperationTwo {
    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };;

    private final String symbol;

    OperationTwo(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);

    private static final Map<String, OperationTwo> stringToEnum = new HashMap<>();

    static {
        for (OperationTwo op : values()) {
            stringToEnum.put(op.toString(), op);
        }
    }

    public static OperationTwo fromString(String symbol) {
        return stringToEnum.get(symbol);
    }
}
