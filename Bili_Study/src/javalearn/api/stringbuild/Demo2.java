package javalearn.api.stringbuild;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 17:58
 **/
public class  Demo2 {
    /*字符串的拼接
    字符串的反转
    * */
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();

        boolean success = str.equals(result);
        System.out.println(success);
    }
}