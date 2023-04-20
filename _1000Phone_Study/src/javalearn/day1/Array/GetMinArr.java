package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/22 20:52
 **/
public class GetMinArr {
    public static int GetMinArr(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
            return min;
        }
        return 0;
    }
        public static void main (String[]args){
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(GetMinArr(arr));
        }
    }
