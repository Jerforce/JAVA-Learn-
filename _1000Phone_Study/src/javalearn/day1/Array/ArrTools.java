package javalearn.day1.Array;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/23 10:46
 **/
public class ArrTools {
    public static void main(String[] args) {
        int[] arr= {11,82,33,4,54,14,77,8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("================================");
        String[] arr2= {"a","bee1","cdd","3asddd","e","fsd","dfffgfgg","7777h","ai","aa"};
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]+"\t");
        }

    }
}
