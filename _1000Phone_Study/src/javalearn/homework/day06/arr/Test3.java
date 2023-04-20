package javalearn.homework.day06.arr;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/24 11:19
 **/
public class Test3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
