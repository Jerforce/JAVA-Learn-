package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/22 20:57
 **/
public class AvgArr {
    public static void Avg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Avg(arr);
    }
}
