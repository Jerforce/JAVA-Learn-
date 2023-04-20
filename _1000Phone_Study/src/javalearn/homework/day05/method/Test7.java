package javalearn.homework.day05.method;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 10:41
 **/
public class Test7 {
    public static void countEquals(int m , int n) {

        for(int i = m; i <= n; i++) {
                System.out.println(m+"x"+i+"="+m*i);
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number m and n,make sure m<=n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        countEquals(m,n);
    }
}
