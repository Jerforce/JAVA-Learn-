package javalearn.homework.day2;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 9:25
 **/
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎使用银行业务，请输入数字键“1234切换业务：");
        int num = input.nextInt();
        switch (num){
            case 1:
                System.out.println("银行卡业务");
                break;
            case 2:
                System.out.println("信用卡业务");
                break;
            case 3:
                System.out.println("业务咨询");
                break;
            case 4:
                System.out.println("人工服务");
                break;
                default:
                    System.out.println("挂机");
        }


    }
}
