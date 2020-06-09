package com.tong.thinking.chapter14.s07.p338;

import com.tong.thinking.chapter14.s07.p337.Interface;
import com.tong.thinking.chapter14.s07.p337.RealObject;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy {

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
