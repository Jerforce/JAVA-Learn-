package javalearn.homework.day06.arr;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/24 11:28
 **/
public class Test5 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                sum += arr[i][j];

            }
            System.out.println(Arrays.toString(arr[i]));

        }

        double avg = sum / 25.0;
        System.out.println("平均数为："+avg);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > avg) {
                    count++;
                    sum += arr[i][j];
                }

            }
        }
        System.out.println("大于平均数的数字之和为：" + sum + "，数量为：" + count);
    }
}
