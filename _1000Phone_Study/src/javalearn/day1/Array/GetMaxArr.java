package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/21 20:08
 **/
public class GetMaxArr {
    public static int GetMaxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(GetMaxArr(arr));
    }
}
