package javalearn.homework.day06.arr;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/24 11:17
 **/
public class Test2 {
    public static void main(String[] args) {
        int []arr = new int[10];
        for(int i = 0;i<10;i++){
            arr[i] = (int)(Math.random()*100);
        }
        sortByChoose(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortByChoose(int [] arr){
            for(int i = 0; i < arr.length; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                if(min!= i) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }

        }
}
