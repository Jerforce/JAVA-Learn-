package com.itheima.methoddemo;

/**
 * @author Jerforce
 * @date 2023/4/17 星期一 20:53:07
 */
public class MethodDemoMkII01 {
    public static <T extends Comparable<T>> T Maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;

    }

    public static void main(String[] args) {
        //目标：利用方法最简单的格式完成当前练习
        //需求：在方法里面定义两个变量并求和打印
        System.out.println(Maximum(10, 20, 30));

        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, Maximum(6.6, 8.8, 7.7));

        System.out.printf("%s, %s 和 %s 中最大的数为 %s\n", "pear",
                "apple", "orange", Maximum("pear", "apple", "orange"));
    }
}
