package javalearn.day1.Array.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/23 11:00
 **/
public class TwoDetentionArray {
    public static void main(String[] args) {
        int[] [] arr ={{11,12,13},{1,2,3}};
        arr[0][0] = 10;
        arr[0][1] = 20;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
