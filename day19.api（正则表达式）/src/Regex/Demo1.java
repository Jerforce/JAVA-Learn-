package Regex;

/**
 * @author Jerforce
 * @date 2023/4/1 星期六 10:32:28
 */
public class Demo1 {
    public static void main(String[] args) {
        String qq = "123645";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //1~9数字开头   不算第一个数字{5，19}位-----实际长度设定{6~20位}

    }
}
