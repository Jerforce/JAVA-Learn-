package javalearn.homework.day06.Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 11:45
 **/
public class Selection_Sort_02 {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
