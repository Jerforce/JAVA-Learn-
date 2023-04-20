package javalearn.day1.Array.aiwork;

/**
 * @author Lenovo
 * @create 2023/3/23 15:25
 **/
public class Demo {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int target=7;
        for(int i=0;i<numbers.length;i++){
            if(i>0&&numbers[i]+numbers[i+1]==target){
                System.out.println(i+" "+(i+1));
            }
        }
    }
}
