package javalearn.homework.day05.method;

/**
 * @author Lenovo
 * @create 2023/3/24 10:19
 **/
public class Test5 {
    public static void daffodil() {
        for(int i =100;i<=999;i++){
            int a = i/100;
            int b = i/10%10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {
        daffodil();
    }
}






