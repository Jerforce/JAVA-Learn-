package javalearn.day1.Array.exercise;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/23 22:09
 **/
public class IncreaseArr {
    public static void main(String[] args) {
        //定义一个整型数组nums
        int[] nums = {1, 2, 3, 2, 4, 5, 6, 7, 6, 3};
        //获取数组长度
        int n = nums.length;
        //定义计数器count
        int count = 0;
        //定义序列长度len
        int len = 1;
        //判断是否递增
        boolean increasing = nums[1] > nums[0];
        //循环遍历数组
        for (int i = 1; i < n; i++) {
            //判断是否递增或递减
            if ((increasing && nums[i] > nums[i-1]) || (!increasing && nums[i] < nums[i-1])) {
                len++;
            } else {
                //如果序列长度大于1，则输出序列
                if (len > 1) {
                    System.out.println(Arrays.toString(Arrays.copyOfRange(nums, i-len, i)));
                    /*这行代码是将数组nums中从i-len到i-1的元素复制到一个新的数组中，并将其转换为字符串形式，
                    然后使用System.out.println()方法将其打印到控制台上。具体来说，
                    Arrays.copyOfRange()方法用于复制指定数组的指定范围，
                    Arrays.toString()方法用于将数组转换为字符串形式。
                    * */
                    count++;
                }
                //重置序列长度和递增状态
                len = 1;
                increasing = !increasing;
            }
        }
        //如果序列长度大于1，则输出序列
        if (len > 1) {
            System.out.println(Arrays.toString(Arrays.copyOfRange(nums, n-len, n)));
            count++;
        }
            //输出总序列数
        System.out.println("总序列数: " + count);

    }
}

