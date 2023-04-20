package javalearn.api.nomalapi;

/**
 * @author Lenovo
 * @create 2023/3/29 11:55
 **/
public class Arrdelete {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.arraycopy(arr,3,arr,2,3  );
        arr[arr.length-1] = 0;
        for (int i = 0; i < arr.length; i++) {
           if(i!=arr.length-1){
               System.out.println(arr[i]+"");

           }else
               System.out.println(arr[i]);
        }

    }
}

