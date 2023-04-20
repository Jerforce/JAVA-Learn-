package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 20:22:26
 */
public class GiftTest {
    public static void main(String[] args) {
      MyRunnable mr = new MyRunnable();

        Thread t3= new Thread(mr,"窗口1");
        Thread t4 = new Thread(mr,"窗口2");

        t3.start();
        t4.start();

    }
}
