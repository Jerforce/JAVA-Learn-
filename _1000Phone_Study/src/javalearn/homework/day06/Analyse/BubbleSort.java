package javalearn.homework.day06.Analyse;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/30 20:15
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}
