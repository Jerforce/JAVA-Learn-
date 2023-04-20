package javalearn.homework.day3;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 11:43
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字：");
        int num = scanner.nextInt();
        System.out.print(num + "的因数有：");
        for (int i = 1; i < num; i++) {
            int x = num / i;
            if (num % i == 0) {
                System.out.print(i + "×" + x+ "=" + num + " ");
            }
        }

    }
}