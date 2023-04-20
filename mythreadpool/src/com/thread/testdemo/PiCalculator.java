package com.thread.testdemo;

/**
 * @author Jerforce
 * @date 2023/4/18 星期二 19:45:26
 */

public class PiCalculator {

    // 线程数
    private static final int THREAD_COUNT = 100;
    // 每个线程计算的点数
    private static final int COUNT_PER_THREAD = 1_000_000;
    // π值
    private static double pi;

    public static void main(String[] args) throws InterruptedException {

        // 开始时间
        long start = System.currentTimeMillis();

        // 创建线程数组
        Thread[] threads = new Thread[THREAD_COUNT];

        // 创建并启动线程
        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new TaskThread();
            threads[i].start();
        }

        // 等待所有线程完成
        for (Thread thread : threads) {
            thread.join();
        }

        // 结束时间
        long end = System.currentTimeMillis();

        // 输出π值与执行时间
        System.out.println(pi);
        System.out.println("Elapsed time: " + (end - start) + "ms");
    }

    // 任务线程类
    static class TaskThread extends Thread {

        @Override
        public void run() {

            // x和y坐标
            double x, y;

            // 线程内部统计计数
            double count = 0.0;

            // 每个线程随机生成COUNT_PER_THREAD个点
            for (int i = 0; i < COUNT_PER_THREAD; i++) {

                // 随机生成点坐标
                x = Math.random();
                y = Math.random();

                // 判断该点是否在单位圆内
                double d = x * x + y * y;
                if (d <= 1) count++;
            }

            // 对pi变量加锁,进行修改
            synchronized (PiCalculator.class) {

                // 累加每个线程的统计结果
                pi += 4 * count / COUNT_PER_THREAD;
            }
        }
    }
}