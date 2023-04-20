package javalearn.day1.Array.exercise;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/23 20:09
 **/
public class EqualArr {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        System.out.println("input 5 numbers:");
        for (int i = 0; i < arr1.length; i++) {
            Scanner scanner = new Scanner(System.in);
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[4];
        for (int i = 0; i < arr1.length-1; i++){
            arr2[i] = arr1[i]*arr1[i+1];
        }
            int max = 0;
            for (int j = 0; j < arr2.length; j++){
                if (arr2[j] > max){
                    max = arr2[j];
                }
            }
        System.out.println(max);
        }
    }

