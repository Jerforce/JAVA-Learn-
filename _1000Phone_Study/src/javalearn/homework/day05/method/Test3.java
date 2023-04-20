package javalearn.homework.day05.method;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 9:59
 **/
public class Test3 {
    public static void main(String[] args) {
        Triangle();
    }
    public static void Triangle() {
        System.out.println("input Triangle test number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                    System.out.print("*");
            }System.out.println();
        }
    }

}
