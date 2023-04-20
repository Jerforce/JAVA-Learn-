package javalearn.api.nomalapi;

/**
 * @author Lenovo
 * @create 2023/3/29 11:52
 **/
public class Arrscopy {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[7];
        System.arraycopy(arr, 0, arr2, 1, 3);
        for (int i = 0; i <arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
