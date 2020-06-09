package com.tong.thinking.chapter14.s07.p338;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MethodSelector implements InvocationHandler {

    private Object proxied;

    public MethodSelector(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting")) {
            System.out.println("Proxy detected the interesting method");
        }
        return method.invoke(proxied, args);
    }
}
