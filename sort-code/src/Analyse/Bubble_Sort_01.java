package Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 11:44
 **/
public class  Bubble_Sort_01 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr=BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[]BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
