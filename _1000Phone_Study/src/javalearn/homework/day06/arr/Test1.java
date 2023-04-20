package javalearn.homework.day06.arr;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/24 11:15
 **/
public class Test1 {
    public static void main(String[] args) {
        int []arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i]=(int)(Math.random()*100);
        }
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int []arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    }
    }
}
