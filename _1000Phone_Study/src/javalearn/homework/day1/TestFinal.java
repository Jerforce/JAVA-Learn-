package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 23:23
 **/
public class TestFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数的整数：");
        int num = sc.nextInt();
        int ge = num % 100 %10;
        int shi = (num /10)% 10 ;
        int bai = (num/100);
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);

        if(num==Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)){
            System.out.println("ture");
            //such as 153;
        }else{
            System.out.println("false");
        }


    }
}
