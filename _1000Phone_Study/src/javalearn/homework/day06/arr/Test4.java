package javalearn.homework.day06.arr;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Lenovo
 * @create 2023/3/24 11:21
 **/
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        FanArr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("====================================================");
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayUtils.reverse(arr2);
        Integer[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list=Arrays.asList(arr3);
        Collections.reverse(list);
        arr3=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr3));





        }
    public static void FanArr(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

}

