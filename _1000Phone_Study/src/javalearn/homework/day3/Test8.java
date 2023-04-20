package javalearn.homework.day3;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 16:35
 **/
public class Test8 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("input 1~10,equal the random num output ture else output flase:");
        int b = sc.nextInt();
        System.out.println(judge(a, b));
    }
    public static boolean judge(int a,int b){
        if(a==b){
            return true;
        }else {
            return false;
        }

    }
}
