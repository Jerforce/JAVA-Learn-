package EXAM;

import java.util.Arrays;

/**
 * @author Jerforce
 * @date 2023/3/31 星期五 17:53:25
 */
public class test1 {
    public static void main(String[] args) {


        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 10);
            arr[i]=n;
        }
        Arrays.sort(arr);

        for(int i=0 ,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
