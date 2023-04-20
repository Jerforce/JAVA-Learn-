package javalearn.day1.Array;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/23 9:29
 **/
public class InputArr {
    public static String[] inputnums() {
        String[] num = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("please input " + (i + 1) + "th" + " num:");
            num[i] = sc.next();
            while (i > 0) {
                boolean duplicate = false;
                //重复为假
                for (int j = 0; j < i; j++) {
                    if (num[j].equals(num[i])) {
                        duplicate = true;
                        System.out.println("num is duplicate,please input another num:");
                        num[i] = sc.next();
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
        String[] num = inputnums();
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}