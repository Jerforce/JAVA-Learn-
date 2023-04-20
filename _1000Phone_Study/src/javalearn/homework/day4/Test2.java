package javalearn.homework.day4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 18:11
 **/
public class Test2 {
    public static void IsSanJX(double x, double y,double z) {
        if(x+y>z&&x+z>y&&y+z>x) {
            System.out.println("三角形成立");
        }else {
            System.out.println("三角形不成立");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三角形的三个边长：");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        IsSanJX(x,y,z);
    }
}

