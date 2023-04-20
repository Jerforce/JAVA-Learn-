package javalearn.homework.day06.Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 20:48
 **/
public class InsertSort {
    public static void InsertTOSort(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int insert =arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>insert) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=insert;
        }
    }
    /*  public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }*/






    public static void main(String[] args) {
        int []arr={1,9,8,7,6,2,3,4,23,61,5,4,3};
        InsertTOSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
