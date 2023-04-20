package com.thread.testdemo;

public class Mythread extends Thread {
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket == 0) {

                break;
            } else {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();

                }
                ticket--;
                System.out.println(getName()+"剩余票数为:" + ticket);

            }
        }
    }
}
