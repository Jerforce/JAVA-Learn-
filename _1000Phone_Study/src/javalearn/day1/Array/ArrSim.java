package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/23 10:24
 **/
public class ArrSim {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,1};
        int[] arr2= new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i]=arr[i];
            System.out.println(arr2[i]);
        }
    }
}
