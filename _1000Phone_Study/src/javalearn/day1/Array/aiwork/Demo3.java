package javalearn.day1.Array.aiwork;

/**
 * @author Lenovo
 * @create 2023/3/23 16:00
 **/
public class Demo3 {
    public static void moveArr(int[] arr, int k) {
        k = k % arr.length;
        // 这个操作的作用是将 k 限制在数组长度范围内，以防止数组越界。
        int[] temp = new int[k];
        for (int i = arr.length - k, j = 0; i < arr.length; i++, j++) {
            temp[j] = arr[i];
        }
        for (int i = arr.length - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        moveArr(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}