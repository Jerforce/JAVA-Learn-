package com.itheima.a04mygenerics;

public class  GenericsDemo2 {
    public static void main(String[] args) {
       /* MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        System.out.println(list);*/


        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(123);
        list2.add(456);
        list2.add(789);


        int i = list2.get(0);
        System.out.println(i);


        System.out.println(list2);
    }
    /*The Lenovo System Interface Foundation Service provides interfaces for key features such as:
    system power management, system optimization, driver and application updates, and system settings
    to Lenovo applications including Lenovo Companion, Lenovo Settings and Lenovo ID. If you disable this
    service, Lenovo applications will not work properly.*/
}
