package javalearn.homework.day3;

/**
 * @author Lenovo
 * @create 2023/3/22 15:59
 **/
public class Test5 {
    public static void main(String[] args) {
        int sum=0;
       for(int i = 0;i<=100;i++){
           sum=i+sum;
           if(sum%3!=0 ){
               System.out.println(sum);
           }
        }
    }
}
