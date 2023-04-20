package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/22 20:59
 **/
public class LocateArr {
    public static int LocateArr(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int num = 10;
        System.out.println(LocateArr(arr,num));
    }
}
