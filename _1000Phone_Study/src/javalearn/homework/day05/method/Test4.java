package javalearn.homework.day05.method;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 10:07
 **/
public class Test4 {
    public static void getNumFruit(){
        Scanner sc =new Scanner(System.in);
        System.out.println("how many days the monkey spends:");
        int days = sc.nextInt();
        int fruits=1+days*1/2;
        System.out.println("there are :"+fruits+" fruits before the monkey eats");
        }

    public static void main(String[] args) {
        getNumFruit();

    }

    }
