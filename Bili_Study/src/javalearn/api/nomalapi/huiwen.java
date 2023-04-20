package javalearn.api.nomalapi;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/29 9:23
 **/
public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入自幂数的位数：");
        int len = sc.nextInt();
        int min = (int)Math.pow(10, len-1);
        int max = (int)(Math.pow(10, len)-1);
        switch (len) {
            case 1:
                System.out.println("独身数");
                break;
            case 2:
                System.out.println(BetwennPalindrome(min,max,2));

                System.out.println("二位自幂数无法成立");
                break;
            case 3:
                System.out.println(BetwennPalindrome(min,max,3));
                System.out.println((count(min,max,3)));
                System.out.println(Palindrome(min,max,3));
                System.out.println("三位自幂数：水仙花");
                break;
            case 4:
                System.out.println(BetwennPalindrome(min,max,4));
                System.out.println("四位自幂数：玫瑰数");
                System.out.println((count(min,max,4)));
                System.out.println(Palindrome(min,max,4));
                break;
            case 5:
                System.out.println(BetwennPalindrome(min,max,5));
                System.out.println("五位自幂数：五角星数");
                System.out.println((count(min,max,5)));
                System.out.println(Palindrome(min,max,len));
                break;
            case 6:
                System.out.println(BetwennPalindrome(min,max,6));
                System.out.println("六位自幂数：六合数");
                System.out.println((count(min,max,6)));
                System.out.println(Palindrome(min,max,len));
                break;
            case 7:
                System.out.println(BetwennPalindrome(min,max,7));
                break;
                default:
                    System.out.println("输入错误");
                    break;
        }

    }
    public static int count(int min,int max,int len){
        int count = 0;
        for(int i = min; i < max; i++) {
            if (isPalindrome(i,len)) {
                count++;
            }
        }
        return count;

    }

    public static boolean BetwennPalindrome(int min,int max,int len) {
        for(int i = min; i < max; i++) {
            if (isPalindrome(i,len)) {
                return true;
            }
        }
        return false;
    }
    public static int Palindrome(int min,int max,int len) {
        for(int i = min; i < max; i++) {
            if (isPalindrome(i,len)) {
                return i;
            }
        }
        return -1;

    }

    public static boolean isPalindrome(int n,int len) {
        String str = String.valueOf(n);
        int sum = 0;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < len; i++) {
            sum+= (int) Math.pow(arr[i], len);
            if (sum == n) {
                return true;
            }
        }
        return false;

    }
}





