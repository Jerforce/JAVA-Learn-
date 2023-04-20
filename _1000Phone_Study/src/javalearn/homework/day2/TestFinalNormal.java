package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 11:25
 **/
public class TestFinalNormal {
    public static boolean IsPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        //div 最高位
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
    /*这段代码是一个判断回文数的函数。首先，如果输入的数小于0，那么它不是回文数，
    。接着，使用一个while循环找到这个数的最高位，即div，比如对于12321这个数，div就是10000。
    然后，使用两个while循环，一个while循环将这个数从左往右拆分成两个数，一个数是left，表示最高位
    ，另一个数是right，表示最低位。如果left和right不相等，那么这个数不是回文数，
    直接返回false。接着，将这个数的最高位和最低位去掉，继续循环，直到这个数变成0
    ，说明已经判断完了所有位数，返回true。
    * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");
        int x = scanner.nextInt();
        System.out.println(IsPalindrome(x));
    }

}
