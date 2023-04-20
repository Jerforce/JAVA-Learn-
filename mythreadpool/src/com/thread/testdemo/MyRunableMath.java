package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 20:32:57
 */
public class MyRunableMath  implements Runnable{
    int num = 1;
  @Override
    public void run(){
        while (true){
            synchronized (Mythread.class){
                if (num>100){
                    break;
                }else {
                   if(num%2==0){
                       System.out.println(Thread.currentThread().getName() + "num "+ num);
                       num++;
                   }
                }
            }
        }
    }
}
