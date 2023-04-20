package javalearn.homework.day1;

/**
 * @author Lenovo
 * @create 2023/3/21 22:13
 **/
public class Test4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = b;
        System.out.println("没变化前abc的值分别为："+a+b+c);
        b = a;
        a = c;
        System.out.println("变换后abc的值分别为："+a+b+c);
    }

}
