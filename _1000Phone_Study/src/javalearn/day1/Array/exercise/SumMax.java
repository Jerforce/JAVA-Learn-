package javalearn.day1.Array.exercise;

/**
 * @author Lenovo
 * @create 2023/3/23 19:38
 **/
public class SumMax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max=0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println("arr:" + arr[i]);

        }
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i] = arr[i]+arr[i+1];
            System.out.println("arr2:" + arr2[i]);

                for (int j = 0; j < arr2.length; j++) {
                    if (arr2[j] > max) {
                        max = arr2[j];
                        temp = j;
                    }
                }
        }
        System.out.println(arr[temp]+"+"+arr[temp+1]+"="+max);
    }
}

