package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 9:44
 **/
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much money do you want to pay?");
        double money = sc.nextDouble();
        if(money>5000){
            System.out.println("Iphone is your choice");
        } else{
            System.out.println("Android is your choice");
        }

    }
}
