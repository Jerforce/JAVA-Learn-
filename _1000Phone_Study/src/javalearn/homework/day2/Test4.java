package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 9:47
 **/
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input what's the temperature today:");
        int temperature = sc.nextInt();
        if ( temperature<20){
            System.out.println("too cold");
        } else if (temperature>20&&temperature<30){
            System.out.println("fine");
        } else if(temperature>30&&temperature<40){
            System.out.println("danger");
        }else if(temperature>40){
            System.out.println("burning");
        }
    }
}
