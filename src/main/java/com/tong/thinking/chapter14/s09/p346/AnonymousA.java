package com.tong.thinking.chapter14.s09.p346;

class AnonymousA {
    public static A makeA() {
        return new A() {
            @Override
            public void f() {
                System.out.println("public C.f()");
            }

            public void g() {
                System.out.println("public C.g()");
            }

            void u() {
                System.out.println("package C.u()");
            }

            protected void v() {
                System.out.println("protected C.v()");
            }

            private void w() {
                System.out.println("private C.w()");
            }
        };
    }
}
