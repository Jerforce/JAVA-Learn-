package Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 11:44
 **/
public class Insertion_Sort_03 {
    public static void insertionSort(int[] arr) {
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
    }


    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length; i++) {
            int insert=arr[i];
            int j=i-1;
            while(j>=0&&insert<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=insert;
        }
    }







    public static void main(String[] args) {
        int []arr={1,9,8,7,6,2,3,4,23,61,5,4,3};
        insertSort(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

}
