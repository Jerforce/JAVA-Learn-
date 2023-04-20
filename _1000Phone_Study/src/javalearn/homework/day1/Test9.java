package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 23:05
 **/
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money:");
        double money = sc.nextDouble();
        System.out.println("Enter your house number");
        int house = sc.nextInt();
        if(money>=2000000&house>3){
            System.out.println("Sleep at your own house");
        }else{
            System.out.println("Time to learn JAVA in QF");
        }
    }
}
