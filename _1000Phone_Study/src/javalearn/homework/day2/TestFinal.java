package javalearn.homework.day2;

/**
 * @author Lenovo
 * @create 2023/3/22 10:36
 **/
public class TestFinal {
    public static void main(String[] args) {
        /* *int x = 12321;
            System.out.println(x%10);  //最后一位
            System.out.println(x/10000);//最前一位
            System.out.println(x%100/10);//倒数第二位
            System.out.println(x/1000%10);//倒数第四位
        * */
        for (int x = 10000; x <= 99999; x++) {
            if (x % 10 == x / 10000 && x % 100 / 10 == x / 1000 % 10) {
                System.out.println(x);
            }
        }

    }
}

