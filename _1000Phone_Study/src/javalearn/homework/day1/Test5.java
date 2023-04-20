package javalearn.homework.day1;

/**
 * @author Lenovo
 * @create 2023/3/21 22:21
 **/
public class Test5 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c1 = a++;
        int c2 = --b;
        int c = --a;
        int d =b++;
        int res1 = (a++)*(--b)+(--a)/(b++);
      //int res1 = 3*1 + 3/1     =6?
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(res1);

    }
}
