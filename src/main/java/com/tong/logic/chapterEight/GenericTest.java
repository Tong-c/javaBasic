package com.tong.logic.chapterEight;

public class GenericTest {


    //通配符只能讀，不可寫
    public void testOne(){
        DynamicArray<Integer> ints = new DynamicArray<>();
        DynamicArray<? extends Number> numbers = ints;

        Integer a = 200;

//        numbers.add(a);
//        numbers.add((Number)a);
//        numbers.add((Object)a);
    }



    public static void swap(DynamicArray<?> arr,int i,int j){
        Object tmp = arr.get(i);
//        arr.set(i,arr.get(i));
//        arr.set(j,tmp);
    }


    private static <T> void swapInternal(DynamicArray<T> arr,int i,int j){
        T tmp = arr.get(i);
        arr.set(i,arr.get(i));
        arr.set(j,tmp);
    }

//    public static <D,S extends D> void copy(DynamicArray<D> desc,DynamicArray<S> src){
//        for(int j = 0;j < src.size();j++){
//            desc.add(src.get(j));
//        }
//    }

    public static <D> void copy(DynamicArray<D> desc,DynamicArray<? extends D> src){
        for(int i = 0;i<src.size();i++){
            desc.add(src.get(i));
        }
    }

}
