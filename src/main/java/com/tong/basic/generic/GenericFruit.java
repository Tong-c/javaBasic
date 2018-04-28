package com.tong.basic.generic;


/**
 * 文章地址：https://blog.csdn.net/s10461/article/details/53941091
 */
public class GenericFruit {


    class Fruit{
        @Override
        public String toString() {
            return "Fruit";
        }
    }

    class Apple extends Fruit{

        @Override
        public String toString() {
            return "Apple";
        }
    }


    class Person{
        @Override
        public String toString() {
            return "Person";
        }
    }

    class GenerateTest<T>{

        public void show1(T t){
            System.out.println(t.toString());
        }

        public <T> void show2(T t){
            System.out.println(t.toString());
        }

        public <E> void show3(E e){
            System.out.println(e.toString());
        }
    }


}
