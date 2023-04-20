package javalearn.homework.day1;

/**
 * @author Lenovo
 * @create 2023/3/21 22:55
 **/
public class Test7 {
    public static boolean IsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(IsLeapYear(2020));
    }
}
