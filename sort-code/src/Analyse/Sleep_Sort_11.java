package Analyse;

import java.util.Arrays;

/**
 * @author Lenovo
 * @create 2023/3/30 11:47
 **/
public class Sleep_Sort_11 {

    public static void sleepSortAndPrint(int[] nums) {
        for (final int num : nums) {
            new Thread(() -> {
                try {
                    Thread.sleep(num * 1000L);
                    System.out.println(num);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

        public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i =0;i<10;i++) {
            int num = (int)(Math.random()*10);
            nums[i] = num;

        }
            System.out.println(Arrays.toString(nums));

            sleepSortAndPrint(nums);
        }
    }

