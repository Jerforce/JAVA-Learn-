package javalearn.homework.day3;

/**
 * @author Lenovo
 * @create 2023/3/22 16:15
 **/
public class Test7 {
    public static void main(String[] args) {
        // i 为 1000内的数
        // j 为 1~x的数
        // x 为 因子
        //保证 x的和等于i
        for (int i = 0; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }

        }
    }
}
