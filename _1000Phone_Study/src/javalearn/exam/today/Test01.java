package javalearn.exam.today;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/21 20:19
 **/
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("传入第一个数字:");
        int a = sc.nextInt();
        System.out.println("传入第二个数字:");
        int b = sc.nextInt();
        System.out.println("传入第三个是运算符号:");
        String type = sc.next();
        System.out.println(calc(a,b,type));
    }

    public static double calc(int a,int b,String type){
         double result = 0;
         switch (type){
         case "+":
             result = a+b;
             break;
         case "-":
             result = a-b;
             break;
         case "*":
             result = a*b;
             break;
         case "/":
             result = a/b;
             break;
     }
     return result;
    }
}
