package javalearn.homework.day4;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 19:27
 **/
public class Test6 {
    public static void Shop(int count_a, int count_b, int count_O){
        double apple=3.5;
        double banana=4.0;
        double orange=5.0;
        double totalPrice=apple*count_a+banana*count_b+orange*count_O;
        System.out.println(totalPrice);
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to shop");
        System.out.println("how many apple you want?");
        int count_a =scanner.nextInt();
        System.out.println("how many banana you want?");
        int count_b =scanner.nextInt();
        System.out.println("how many orange you want?");
        int count_O =scanner.nextInt();
        Shop(count_a,count_b,count_O);

    }
}
