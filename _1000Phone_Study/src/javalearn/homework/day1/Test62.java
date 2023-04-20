package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 22:52
 **/
public class Test62 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入一个整数：");
            int num = sc.nextInt();
            int digitCount = 0;
            int temp = num;

            // 确定整数的位数
            while (temp != 0) {
                digitCount++;
                temp /= 10;
            }

            // 输出每一位数字
            System.out.print(num + "是" + digitCount + "位数，每一位的数字是：");
            for (int i = digitCount - 1; i >= 0; i--) {
                int digit = (int)(num / Math.pow(10, i) % 10);
                System.out.print(digit + " ");
            }
        }
}
