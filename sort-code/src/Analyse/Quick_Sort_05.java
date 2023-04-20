package Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 11:45
 **/
public class Quick_Sort_05 {
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;


    }
    public static void main(String[] args) {
        int []arr= {1,9,8,1,3,643,1131,6461,3,431,52,862,53};
        quickSort(arr, 0, arr.length - 1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
