package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 23:01
 **/
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Age for now ?");
        int age = sc.nextInt();
        String name1="laowang";
        String name2="xiaowang";
        if(age>35){
            System.out.println(name1);
        }else{
            System.out.println(name2);
        }
    }
}
