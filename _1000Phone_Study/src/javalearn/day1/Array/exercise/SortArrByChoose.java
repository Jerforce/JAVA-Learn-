package javalearn.day1.Array.exercise;

/**
 * @author Lenovo
 * @create 2023/3/23 19:26
 **/
public class SortArrByChoose {
    public static void main(String[] args) {
        int[] arr = {9,45,1,72,31,33,23,};
        for(int i = 0; i <arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
