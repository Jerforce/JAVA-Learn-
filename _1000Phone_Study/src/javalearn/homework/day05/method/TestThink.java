package javalearn.homework.day05.method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/24 10:52
 **/
public class TestThink {
    public static int GetMinSecondToLastRandom(int n){
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int random = (int) (Math.random() * 100);
            arr[i - 1] = random;

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        return arr[1];
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        GetMinSecondToLastRandom(n);
    }
}
