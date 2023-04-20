package Test_AI.day0331;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Jerforce
 * @date 2023/3/31 星期五 17:46:46
 */
public class Test9 {

    public static void main(String[] args) {
        int[] arr = new int[10]; // create an array of size 10
        Random rand = new Random(); // create a random number generator
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10); // fill the array with random numbers between 0 and 9
            if (i % 2 == 0) {
                arr[i] = 0; // set every other element to 0
            }
        }
        int[] zeros = new int[arr.length / 2]; // create a new array to hold the 0s
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros[j] = arr[i]; // add the 0 to the new array
                j++;
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Zeros array: " + Arrays.toString(zeros));
    }
}

