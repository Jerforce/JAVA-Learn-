package javalearn.homework.day06.Analyse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Lenovo
 * @create 2023/3/30 11:46
 **/
public class Bucket_Sort_08 {
    public static void bucketSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int bucketSize = (max - min) / arr.length + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucketSize; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (arr[i] - min) / bucketSize;
            buckets.get(bucketIndex).add(arr[i]);
        }
        for (int i = 0; i < buckets.size(); i++) {
            Collections.sort(buckets.get(i));
        }
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {121,32, 3, 74, 54, 6, 78, 8, 39, 110};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
