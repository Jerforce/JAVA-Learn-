package javalearn.homework.day05.method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 10:52
 **/
public class Test8 {
    public static int GetMinRandom(int n){
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int random = (int) (Math.random() * 100);
            arr[i - 1] = random;

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        return arr[0];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        GetMinRandom(n);
    }
}
