package javalearn.homework.day06.Analyse;

/**
 * @author Lenovo
 * @create 2023/3/30 20:32
 **/
public class SelectSort {

    public static void BubbleSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];

                }
            }
        }
    }


    public static void SelectionSort(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }


    public static void main(String[] args) {
        int []arr={17,8,6,9,11,21,14,46,2,5,6,528,9,10};
       SelectionSort(arr);
       // BubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
