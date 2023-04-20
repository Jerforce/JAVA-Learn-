package javalearn.day2.main;

/**
 * @author Lenovo
 * @create 2023/3/22 16:58
 **/
public class Main1 {
    public  static void closedoor(){
        //无参无返回值
        System.out.println("close door");
    }
    public static void GetMaxNum(int num1,int num2,int num3){
        //有参无返回值
        int max = 0;
        if(num1>num2&&num1>num3){
            max = num1;
        }else if(num2>num1&&num2>num3){
            max = num2;
        }else if(num3>num1){
            max = num3;
        }
        System.out.println("max number: " + max);
    }
    public static int Sum(int num1,int num2,int num3){
        //无参有返回
        return num1+num2+num3;
    }

    public static boolean IsPrime(int num){
        //有参有返回
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //方法的调用
        closedoor();
        GetMaxNum(1,2,3);
        System.out.println(Sum(1,2,3));
        System.out.println(IsPrime(1));
    }
}
