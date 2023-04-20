package com.itheima.a02innerclassdemo2;

public class Outer {
    String name;

    public Inner getInstance() {
        return new Inner();
    }

    private class Inner {
        static int a = 10;
    }


}
