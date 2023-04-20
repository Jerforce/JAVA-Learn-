package javalearn.api.demostring.string;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 16:34
 **/
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
       for(int i = 0; i < str.length(); i++){
           char c = str.charAt(i);
           c=str.charAt(str.length()-1-i);
           System.out.print(c);

       }

    }
}
