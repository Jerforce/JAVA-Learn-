package javalearn.day1.Array;

import java.util.Scanner;

/**
 * @author Lenovo
 * @create 2023/3/22 20:44
 **/
public class Demo3 {
    public static void main(String[] args) {
        String[]names = makeNames();
        for(int i=1;i<=names.length;i++){
            System.out.println(names[i-1]);
        }
    }
    public static String[] makeNames(){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        for(int i=0;i<names.length;i++){
            names[i] = sc.next();
        }
        return names;
    }
}
