package javalearn.day1.Array.exercise;


/**
 * @author Lenovo
 * @create 2023/3/23 18:47
 **/
public class Test1 {
    public static void main(String[] args) {
        int ram = (int) (System.currentTimeMillis()  / Math.pow(12,10));
        int num = (int) (Math.random()*ram);
        //确保相对随机
        int [] arr =new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*num);
    }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("初始化的第"+(i+1)+"个数为："+arr[i]);
            sum+=arr[i];
        }
        System.out.println("上面6个数的平均数为："+sum/arr.length);
    }
}
