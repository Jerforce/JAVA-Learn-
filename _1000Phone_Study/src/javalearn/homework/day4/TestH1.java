package javalearn.homework.day4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 19:37
 **/
public class TestH1 {
    public static boolean IsPrimeNumber(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number:");
        int n = scanner.nextInt();
        System.out.println(IsPrimeNumber(n));
    }
}

