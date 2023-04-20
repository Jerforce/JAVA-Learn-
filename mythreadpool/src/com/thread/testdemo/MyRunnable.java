package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 20:24:08
 */

public class MyRunnable implements Runnable {

        int count = 100;

    @Override
    public void run() {
        while (true) {
            synchronized (Mythread.class){
                if (count<10){
                    System.out.println(Thread.currentThread().getName()+"gift left"+count+" dont reached  10   ");
                    break;
                }else {
                    count--;
                    System.out.println(Thread.currentThread().getName()+"gift left "+count+" continue");
                }
            }

        }

    }
}

