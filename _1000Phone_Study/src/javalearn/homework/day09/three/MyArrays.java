package javalearn.homework.day09.three;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/28 20:45
 **/
public class MyArrays {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;

    }

    public static int search(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                System.out.println("存在的下标为：");
                return i;

            }
        }
        System.out.println("没有");
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {17,6,9,7,11,1,9,14,99,19,36,266,5952,55};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        max(arr);
        System.out.println(max(arr));
        System.out.println(search(arr, 99));

    }

}

