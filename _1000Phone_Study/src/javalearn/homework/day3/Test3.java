package javalearn.homework.day3;

/**
 * @author Lenovo
 * @create 2023/3/22 14:56
 **/
public class Test3 {
    public static void main(String[] args) {
        double m = 8844.13 * 1000;
        double p = 0.08;
        int x = 1;
        while (p < m) {
            p = p * 2;
            x++;
        }
        System.out.println(x);
    }
}

