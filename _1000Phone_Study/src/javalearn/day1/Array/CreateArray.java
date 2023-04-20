package javalearn.day1.Array;

/**
 * @author Lenovo
 * @create 2023/3/21 19:47
 **/
public class CreateArray {
    public static void main(String[] args) {
        /*
        * 错误写法
        * int[] arr1;
        * arr1 = {1,2,3};
        * */

        int[] arr1 ={1,2,3};
        //方法一：声明时直接分配了空间，并赋值

        int[]arr2;
        arr2 = new int[]{1,2,3};


        int[]arr3;
        arr3 = new int[3];
        //方法二/三 声明与内存是分开的
    }
}
