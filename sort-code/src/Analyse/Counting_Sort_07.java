package Analyse;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/30 11:46
 **/
public class Counting_Sort_07 {
    public static void countingSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int[] count = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {513,64,99,31,32,6,04,620,35,9,8,7,6,5,4,3,2,1};


        countingSort(arr);


        for(int i:arr) {
            System.out.print(i+" ");
        }
    }



}
