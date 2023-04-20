package com.itheima.test;

/**
 * @author Jerforce
 * @date 2023/4/10 星期一 15:14:51
 */
public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("hello ");
        sb1.append("World ");
        System.out.println(sb1);

        sb1.replace(3,5,"hello");
        System.out.println(sb1);

        sb1.delete(3,5);

        System.out.println(sb1);

        sb1.insert(3,"hello");
        System.out.println(sb1);

        sb1.insert(3,"hello",2,3);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

    }
}
