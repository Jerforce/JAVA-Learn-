package javalearn.homework.day4;

/**
 * @author Lenovo
 * @create 2023/3/22 20:16
 **/
public class TestH3 {
    public static boolean IsPrimeNumber(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    public static void main(String[] args) {
        for(int i=2;i<100;i++){
            if(IsPrimeNumber(i)==true){
                System.out.println(i);
            }
        }
    }

}
