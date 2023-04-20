package com.itheima.a01threadcase1;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 15:18:19
 */
public class Thread0 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "HelloWorld!");
        }
    }

    class myThread0 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                if (i == 50) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "HelloWorld!");
            }
        }
    }


    public static void main(String[] args) {
        Thread0 t1 = new Thread0();
        Thread0 t2 = new Thread0();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}