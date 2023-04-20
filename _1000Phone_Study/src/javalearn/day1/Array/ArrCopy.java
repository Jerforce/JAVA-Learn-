package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/23 10:18
 **/
public class ArrCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[arr.length +1];
        int[] arr3 = new int[arr.length ];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
            System.out.println(arr3[i]);
        }



    }
}

