package javalearn.homework.day1;
import java.util.Scanner;
/**
 * @author Lenovo
 * @create 2023/3/21 22:44
 **/
public class Test61 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入一个整数：");
            int num = sc.nextInt();
            String str = Integer.toString(num);
            // 将整数转化为字符串
            int len = str.length();
            // 字符串长度即为数字的位数
            System.out.println("这是一个" + len + "位数，每一位数字分别为：");
            for (int i = 0; i < len; i++) {
                System.out.println(str.charAt(i));
            }
        }
}

