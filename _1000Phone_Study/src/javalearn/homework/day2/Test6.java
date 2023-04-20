package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 10:11
 **/
public class Test6 {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("input two numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        num1 = sc.nextInt();
        System.out.println("next number:");
        num2 = sc.nextInt();

        int max = num1 > num2? num1 : num2;
        int min = num1 < num2? num1 : num2;

        int lcm,gcd=1;
        //最大公约数是gcd  , 最小共倍数是lcm

        for(int i=1;i<=min;i++){
            if(max%i==0&&min%i==0){
                gcd=i;
            }
        }
        //最大公约数算法
        lcm=min*max/gcd;
        System.out.println(num1+"和"+num2+"的最大公约数是"+gcd);
        System.out.println(num1+"和"+num2+"的最小共数倍是"+lcm);
    }
}
