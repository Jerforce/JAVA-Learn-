package javalearn.day1.Array;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/21 19:36
 **/
public class IntArray {
    public static void main(String[] args) {
        String[] aArray = new String[5];
        String[] bArray = {"a","b","c","d","e"};
        System.out.println(aArray.length);
        System.out.println(bArray.length);

        //方式一
        int [] arr = new int[5];
        //元素类型[]数组名=new 元素类型[元素个数或者数组长度]
        arr[0] = 1;
        arr[1] = 2;
        //方式二
        int [] arr2 = new int[]{3,4,3,1,5};
        int [] arr3 ={3,4,3,1,5};
        System.out.println(Arrays.equals(arr2, arr3));
        //元素类型[]数组名=new元素类型[]{元素，元素，元素，，，，}




    }
}
