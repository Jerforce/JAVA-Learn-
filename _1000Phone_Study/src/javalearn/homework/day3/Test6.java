package javalearn.homework.day3;

/**
 * @author Lenovo
 * @create 2023/3/22 16:10
 **/
public class Test6 {
    //1+2-3+4-5+6-7+8-9+10
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }else {
                sum-=i;
            }
        }
        System.out.println("sum: " + sum);

    }
}
