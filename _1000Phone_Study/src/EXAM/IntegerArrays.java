package EXAM;

import java.util.Arrays;

/**
 * @author Jerforce
 * @date 2023/3/31 星期五 20:29:04
 */
public class IntegerArrays {
    public static void main(String[] args) {
        int[]arr={4,6,7,2,78,5};
        int[]arr2 = copy(arr);
        System.out.println(Arrays.toString(arr2)+"arr2");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max=arr[arr.length-1];
        System.out.println(max+"最大值");
        int min=arr[0];
        System.out.println(min+"最小值");
        int maxIndex=0;
        int minIndex=0;
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i]==max){
                maxIndex = i;
                System.out.println(i+"最大值下标");

                arr2[maxIndex] = arr2[i];
                System.out.println(arr2[maxIndex]+"最大值");
                arr2[i] = max;
            }
            if(arr2[i]==min){
               minIndex = i;

               arr2[minIndex] = arr2[i];
               arr2[i] = min;
            }

        }
        System.out.println(Arrays.toString(arr2));

    }


    private static int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
