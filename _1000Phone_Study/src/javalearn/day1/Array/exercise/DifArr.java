package javalearn.day1.Array.exercise;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/23 20:17
 **/
public class DifArr {

    public static int[] insert() {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("please input " + (i + 1) + "th" + " number:");
            num[i] = sc.nextInt();
            while (i > 0) {
                boolean duplicate = false;
                //重复为假
                for (int j = 0; j < i; j++) {
                    if (num[i] == num[j]) {
                        duplicate = true;
                        System.out.println("num is duplicate,please input another num:");
                        num[i] = sc.nextInt();
                        //重新存
                        break;
                    }
                }
                if (!duplicate) {
                    break;
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        int[] num = insert();
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("=============================================");
        Arrays.sort(num, 0, num.length);
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(num));
    }
    }
