package javalearn.day1.Array.exercise;

/**
 * @author Lenovo
 * @create 2023/3/23 19:12
 **/
public class Test2 {
    public static void main(String[] args) {
        int ram = (int) (System.currentTimeMillis() / Math.pow(12, 10));
        int num = (int) (Math.random() * ram);
        //确保相对随机
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num);
        }
        int sum = 0,avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
            System.out.println("10个中:"+"第"+(i+1)+"个为： "+arr[i]+"\t");
        } System.out.println("avg:"+avg);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                System.out.println("低于avg的："+arr[i]+"\t");
            }
        }

    }
}
