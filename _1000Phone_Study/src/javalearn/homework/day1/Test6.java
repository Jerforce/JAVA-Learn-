package javalearn.homework.day1;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 22:27
 **/
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位数整数：");
        int num = sc.nextInt();
        int ge = num%1000%100%10;
        int shi = (num / 10)%100%10;
        int bai = (num / 100)%10;
        int qian = (num/1000);
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
        System.out.println(qian);
        sc.close();
    }
}
