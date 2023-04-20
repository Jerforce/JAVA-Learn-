package javalearn.homework.day10.object;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/28 22:33
 **/
public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word : words) {
            String firstLetter = word.substring(0, 1);
            String restLetters = word.substring(1);
            result.append(firstLetter.toUpperCase()).append(restLetters);
        }
        System.out.println(result.toString());
    }
}
