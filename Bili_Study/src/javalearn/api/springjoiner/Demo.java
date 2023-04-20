package javalearn.api.springjoiner;

import java.util.StringJoiner;

/**
 * @author Lenovo
 * @create 2023/3/27 18:49
 **/
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");

        }
        System.out.println(sj);


        StringJoiner sjh = new StringJoiner("---");
        for (int i = 0; i < arr.length; i++) {
            sjh.add(arr[i] + "");

        }
        System.out.println(sjh);




        StringJoiner sjh1 = new StringJoiner(",", "[", "]");
        sjh1.add("21");

    }
}