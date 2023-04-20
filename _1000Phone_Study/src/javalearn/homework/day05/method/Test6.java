package javalearn.homework.day05.method;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 10:23
 **/
public class Test6 {
    public static void PrimeBetween(int n,int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            if (IsPrimeNumber(i)==true){
                count++;
            }
        }
        System.out.println(count+" prime numbers between "+n+" and "+m);
    }

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
        Scanner sc = new Scanner(System.in);
        System.out.println("please input num n&m (!!! make sure n>m) count how many prime number between them  :");
        System.out.println("input num n:");
        int n = sc.nextInt();
        System.out.println("input num m:");
        int m = sc.nextInt();
        PrimeBetween(n,m);
        sc.close();
    }
}
