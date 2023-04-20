package javalearn.homework.day3;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 14:34
 **/
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int n = sc.nextInt();
        double score = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("输入第" + i + "学员成绩:");
            score += sc.nextInt();
        }

        System.out.println(score / n);


    }
}
