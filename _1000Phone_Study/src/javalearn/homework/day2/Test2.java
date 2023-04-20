package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 9:32
 **/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = sc.nextInt();
        System.out.println("输入年份：");
        int year = sc.nextInt();
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("输入月份有误！");;
                break;
        }
        System.out.println(year+"年"+month+"月"+days+"天");
    }
}
