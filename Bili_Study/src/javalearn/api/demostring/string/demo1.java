package javalearn.api.demostring.string;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/27 16:21
 **/
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input something String:");
        String str = sc.next();
        int SmallCount = 0;
        int numberCount = 0;
        int bigCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                SmallCount++;
            } else if(c >= 'A' && c <= 'Z') {
                bigCount++;
            }else if(c >= '0' && c <= '9') {
                numberCount++;
            }

        }
        System.out.println(SmallCount);
        System.out.println(bigCount);
        System.out.println(numberCount);
    }

}
