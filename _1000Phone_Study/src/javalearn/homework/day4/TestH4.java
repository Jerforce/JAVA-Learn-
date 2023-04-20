package javalearn.homework.day4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 20:28
 **/
public class TestH4 {

    public static void GetMaxNum(int num1, int num2, int num3) {
        //有参无返回值
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3){
            max = num2;
        } else if (num3 > num1&& num3 > num2){
            max = num3;
        }
        System.out.println("max number: " + max);
    }
    public static void GetMinNum(int num1, int num2, int num3){
        //有参无返回值
        int min = 0;
        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num1 && num2 < num3){
            min = num2;
        } else if (num3 < num1 && num3 < num2){
            min = num3;
        }
        System.out.println("min number: " + min);
    }

    public static void main(String[] args) {
        System.out.println("input number1,number2,number3:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        GetMaxNum(num1, num2, num3);
        GetMinNum(num1, num2, num3);
    }
}