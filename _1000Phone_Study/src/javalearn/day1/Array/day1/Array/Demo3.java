package javalearn.day1.Array.day1.Array;
import java.util.Scanner;
/**
 * @author Lenovo
 * @create 2023/3/23 11:58
 **/
public class Demo3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please input numbers:");
            int[] arr = new int[100];
            int i = 0;
            while (true) {
                String input = scanner.next();
                if (input.equals("sum")) {
                    break;
                }
                arr[i] = Integer.parseInt(input);
                i++;
            }
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            System.out.println("The sum is: " + sum);
        }
    }

