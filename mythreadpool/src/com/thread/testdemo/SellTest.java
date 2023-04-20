package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 20:16:13
 */
public class SellTest {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}

