package javalearn.api.nomalapi;

/**
 * @author Lenovo
 * @create 2023/3/29 11:42
 **/
public class TimeforJAva {
    public static void main(String[] args) {
        Long Start = System.currentTimeMillis();

        for (int i = 0; i <= 100; i++) {
            boolean flag=IsPrime(i);
            if (flag) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
       long time1=(end-Start);
        Long Start1 = System.currentTimeMillis();

        for (int i = 0; i <= 100; i++) {
            boolean flag1 = IsPrime2(i);
            if (flag1) {
                System.out.println(i);
            }
        }
        long end1 = System.currentTimeMillis();
        long time2=(end1-Start1);

        System.out.println(time1-time2);





    }
    public static boolean IsPrime(int n) {
        for(int i = 2;i<n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean IsPrime2(int n) {
        for(int i = 2;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                return true;
            }
        }
        return false;
    }



}

