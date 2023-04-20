package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 11:17
 **/
public class TestFinalHard {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("input some numbers or something, check that's the palindrome:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));
    }
}
