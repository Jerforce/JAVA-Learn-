package javalearn.api.demostring.string;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 16:18
 **/
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input something:");
        String str = sc.next();
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }



}
