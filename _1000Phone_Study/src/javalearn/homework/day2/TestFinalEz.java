package javalearn.homework.day2;

/**
 * @author Lenovo
 * @create 2023/3/22 11:09
 **/
public class TestFinalEz {
    public static void main(String[] args) {
        for (int num = 10000; num <= 99999; num++) {
            String number = Integer.toString(num);
            if (number.charAt(0) == number.charAt(4) && number.charAt(1) == number.charAt(3)) {
                /*
                 12321
                 01234  字符串指针 位置  0和4相同&&1和3相同
                */
                System.out.println(number);
            }

        }
    }
}
