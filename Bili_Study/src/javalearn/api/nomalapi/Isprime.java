package javalearn.api.nomalapi;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/29 9:18
 **/
public class Isprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (Isprime.isPrime(n)) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");

}

    }
    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(n); i++) {
            count++;
            if (n % i == 0) {
                return false;
            }


        }
        System.out.println(count + "个质数");
        return true;
    }
}
