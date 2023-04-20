package Analyse;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/30 11:46
 **/
public class Radix_Sort_09 {
    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    public static void countingSortByDigit(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0 && count[arr[i] / exp] > 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[]arr={9,8,79,2,6,1,649,34,79,5,5,4,54,5,77,6,5,4,3,2,1};
        radixSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
