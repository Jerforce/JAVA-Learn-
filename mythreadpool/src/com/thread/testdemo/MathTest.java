package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 20:32:39
 */
public class MathTest {
    public static void main(String[] args) {

        MyRunableMath mt = new MyRunableMath();

        Thread t1 = new Thread(mt, "窗口1");
        Thread t2 = new Thread(mt, "窗口2");
        t1.start();
        t2.start();

    }
}